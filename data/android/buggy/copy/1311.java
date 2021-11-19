public static java.lang.String readLine() {
    java.lang.String string = "";
    try {
        string = ibms.RDH.input.readLine();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error with STD IN");
        java.lang.System.exit(1);
    }
}