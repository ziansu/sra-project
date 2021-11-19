public konstructs.api.Stack take(int n) {
    if (n == 0)
        return null;
    
    return new konstructs.api.Stack(java.util.Arrays.copyOf(blocks, java.lang.Math.min(n, blocks.length)));
}