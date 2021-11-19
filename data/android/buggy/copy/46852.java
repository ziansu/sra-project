private void junkRead(java.io.BufferedReader reader, long duration) throws java.io.IOException {
    long start = java.lang.System.currentTimeMillis();
    while ((start + duration) < (java.lang.System.currentTimeMillis()))
        reader.readLine();
    
}