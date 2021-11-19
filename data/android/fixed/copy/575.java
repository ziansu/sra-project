java.lang.String nextLine() {
    java.lang.String str = "";
    try {
        str = br.readLine();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return str;
}