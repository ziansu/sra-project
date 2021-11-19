public static void main(java.lang.String[] args) {
    try {
        new genesis.Genesis();
    } catch (java.io.IOException e) {
        genesis.Genesis.printError(new java.io.PrintWriter(java.lang.System.err), e);
    }
}