public konstructs.api.Stack take(int n) {
    return new konstructs.api.Stack(java.util.Arrays.copyOf(blocks, java.lang.Math.min(n, blocks.length)));
}