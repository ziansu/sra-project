public void setStdout(java.io.OutputStream os) {
    if (os instanceof java.io.PrintStream)
        stdout = ((java.io.PrintStream) (os));
    else
        stdout = new java.io.PrintStream(os);
    
}