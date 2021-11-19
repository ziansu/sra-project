@java.lang.Override
public void bind(de.lessvoid.nifty.Nifty nifty, de.lessvoid.nifty.screen.Screen screen) {
    super.onStartScreen();
    maud.Maud maud = ((maud.Maud) (guiApplication));
    maud.startup2();
}