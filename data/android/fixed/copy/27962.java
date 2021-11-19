public java.lang.String[] readFirst(KenTwo.Server.DB.Select s) {
    table = read(s);
    return table.get(0);
}