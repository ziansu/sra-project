public void clearDB() {
    java.lang.System.out.println("Heart, clearDB() started... ");
    tm = new KenTwo.Server.TableManager(pc1);
    tm.dropAllTables();
    java.lang.System.out.println("Heart, clearDB() finished!");
}