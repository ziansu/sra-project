protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDB();
    initParse();
    getLocalHighscore();
    setupUI();
    getScoreList();
}