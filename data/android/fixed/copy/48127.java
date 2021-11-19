private void setUpDatabaseData() {
    com.hakerjack.crackthecodinginterview.data.Problem p1 = new com.hakerjack.crackthecodinginterview.data.Problem.Builder().setTitle("Number of Islands").setContent("Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.").build();
    com.pixplicity.easyprefs.library.Prefs.putBoolean(SharedPrefsUtil.PREFS_KEY_IS_FIRST_TIME, false);
}