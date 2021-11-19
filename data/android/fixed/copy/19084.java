private void readAndPrint() {
    try {
        java.lang.String str = input.readLine();
        if (str != null) {
            java.lang.System.out.println(str);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}