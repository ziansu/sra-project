@java.lang.Override
protected void setUp() {
    pl = new model.PuzzleLevel(1);
    rl = new model.ReleaseLevel(2);
    ll = new model.LightningLevel(3);
    b = new app.Builder();
    b.defaultDirectory = "./imbriusLevelTESTING/";
    b.levelData = new app.StarMap("./imbriusLevelTESTING/");
}