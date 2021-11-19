private void readAndPrint() {
    try {
        java.lang.String str = input.readLine();
        java.lang.System.out.println(str);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}