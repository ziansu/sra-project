java.lang.String nextLine() {
    java.lang.String str = "";
    try {
        str = br.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return str;
}