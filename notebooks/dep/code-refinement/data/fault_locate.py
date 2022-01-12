import os
from typing import List
import numpy as np


def locate(buggy: str, fixed: str) -> List[bool]:
    """
    Compare buggy and fixed. Locate changed parts in buggy code using a indicator array (0: unchanged; 1: changed).
    """
    buggy = buggy.strip().split(' ')
    fixed = fixed.strip().split(' ')

    m, n = len(buggy), len(fixed) 
    
    # [Longest Common Subsequence](https://en.wikipedia.org/wiki/Longest_common_subsequence_problem)

    def LCS(X, Y):
        m, n = len(X), len(Y)
        C = np.zeros(shape=(m+1,n+1))   #  `np.empty` is random!!
        # for i in range(m):
        #     C[i, 0] = 0
        # for j in range(n):
        #     C[0, j] = 0
        for i in range(1, m+1):
            for j in range(1, n+1):
                if X[i-1] == Y[j-1]:
                    C[i, j] = C[i-1, j-1] + 1
                else:
                    C[i, j] = max(C[i, j-1], C[i-1,j])
        return C
    
    def backtrack(C, X, Y, i, j):
        if i == 0 or j == 0:
            return []
        if X[i-1] == Y[j-1]:
            return backtrack(C, X, Y, i-1, j-1) + [X[i-1]]
        if C[i, j-1] > C[i-1, j]:
            return backtrack(C, X, Y, i, j-1)
        else:
            return backtrack(C, X, Y, i-1, j)

    def indicate_change(X, R):
        change = []
        j = 0
        for i in range(len(X)):
            if j < len(R) and X[i] == R[j]:
                j += 1
                change.append(0)
            else:
                change.append(1)
        # assert j == len(R)
        return change

    C = LCS(buggy, fixed)
    read_out = backtrack(C, buggy, fixed, m, n)
    change = indicate_change(buggy, read_out)
    assert len(change) == len(buggy)
    # print('X:',buggy)
    # print('Y:',fixed)
    # print('RO:', read_out)
    # print('change:',change, len(change), len(buggy))
    # assert 0
    return change
    

def create_floc_dataset(buggy_file, fixed_file, output_dir, suffix):
    """
    Create fault location dataset for extra training target
    """
    with open(buggy_file, 'r') as f1, open(fixed_file, 'r') as f2:
        buggy_lines = f1.readlines()
        fixed_lines = f2.readlines()
    
    location_dataset = []
    for buggy_line, fixed_line in zip(buggy_lines, fixed_lines):
        try:
            location = locate(buggy_line, fixed_line)
        except IndexError:
            print('buggy_line:', buggy_line)
            print('fixed_line:', fixed_line)
            assert 0
        location_dataset.append(location)
    
    with open(os.path.join(output_dir, suffix), 'w') as f:
        for line in location_dataset:
            f.write(''.join(map(str, line)) + '\n')


if __name__ == '__main__':

    # example_buggy = 'public java.lang.String METHOD_1 ( ) { return new TYPE_1 ( STRING_1 ) . format ( VAR_1 [ ( ( VAR_1 . length ) - 1 ) ] . getTime ( ) ) ; }'
    # example_fixed = 'public java.lang.String METHOD_1 ( ) { return new TYPE_1 ( STRING_1 ) . format ( VAR_1 [ ( ( type ) - 1 ) ] . getTime ( ) ) ; }'
    # print(locate(example_buggy, example_fixed))

    # create_floc_dataset(
    #     'small/train-split-10/0-src.txt',
    #     'small/train-split-10/0-targ.txt',
    #     'small/train-split-10/',
    #     '0-floc.txt'
    # )

    # create_floc_dataset(
    #     'small/valid.buggy-fixed.buggy',
    #     'small/valid.buggy-fixed.fixed',
    #     'small/',
    #     'valid.buggy-fixed.floc'
    # )

    
    # create_floc_dataset(
    #     'small/train-split-20/0-src.txt',
    #     'small/train-split-20/0-targ.txt',
    #     'small/train-split-20/',
    #     '0-floc.txt'
    # )

    create_floc_dataset(
        'small/train-split-5/0-src.txt',
        'small/train-split-5/0-targ.txt',
        'small/train-split-5/',
        '0-floc.txt'
    )