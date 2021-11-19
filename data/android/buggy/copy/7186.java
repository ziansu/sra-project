public  WeightedQuickUnionUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++)
        id[i] = i;
    
    sz[i] = 1;
}