public static void main(java.lang.String[] args) throws Structure.PageNotLoadedException, java.io.IOException, team_7adota.DBAppException {
    Structure.Table t = Structure.Table.buildBuildedTable("n", 1);
    Structure.Page p = t.getPageByNumber(1);
    java.lang.System.out.println(p.toString());
}