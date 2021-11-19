public void emtyFile() throws java.io.IOException {
    br.close();
    f.delete();
    f.createNewFile();
    br = new java.io.BufferedReader(new java.io.FileReader(f));
}