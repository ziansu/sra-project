import os
import random
import math

def sample_train(src_path: str, targ_path: str, output_dir: str, split: int=5) -> None:
    with open(os.path.join(data_dir, src_path), 'r') as f1, \
        open(os.path.join(data_dir, targ_path), 'r') as f2:
        src_splits = [[] for _ in range(split)]
        targ_splits = [[] for _ in range(split)]
        for i, (src, targ) in enumerate(zip(f1.readlines(), f2.readlines())):
            index = i % split
            src_splits[index].append(src)
            targ_splits[index].append(targ)
    split_output_dir = os.path.join(output_dir, 'train-split-{}'.format(split))
    if not os.path.isdir(split_output_dir):
        print('The directory is not present. Creating a new one..')
        os.mkdir(split_output_dir)
    else:
        print('The directory is present.')
    for i in range(split):
        with open(os.path.join(split_output_dir, '{}-src.txt'.format(i)), 'w') as f:
            f.writelines(src_splits[i])
        with open(os.path.join(split_output_dir, '{}-targ.txt'.format(i)), 'w') as f:
            f.writelines(targ_splits[i])



def sample_test(src, targ, output_dir, split_ratio=0.2):
    pass


if __name__ == '__main__':
    data_dir = './small'  # 46680
    # data_dir = './medium'   # 52364
    buggy = 'train.buggy-fixed.buggy'
    fixed = 'train.buggy-fixed.fixed'
    sample_train(buggy, fixed, data_dir, split=20)