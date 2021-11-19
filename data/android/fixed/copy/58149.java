@org.junit.Before
public final void beforeIntegration() {
    launcher = new nl.weeaboo.vn.Launcher();
    launcher.create();
    novel = launcher.getNovel();
}