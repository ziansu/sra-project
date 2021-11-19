public static java.lang.String[] getInfo(int pid) throws java.lang.Exception {
    java.util.ArrayList<java.lang.String[]> ret = ApplicationInterface.SQLExecutor.executeQuery((("SELECT pid,name,category FROM acmdb05.Pois WHERE pid=" + pid) + ";"));
    return ret.get(1);
}