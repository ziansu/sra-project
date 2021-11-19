public java.lang.String[] readFirst(KenTwo.Server.DB.Select s) {
    java.util.ArrayList<java.lang.String[]> table = read(s);
    return table.get(0);
}