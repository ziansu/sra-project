@java.lang.Override
public void show(de.tomgrill.gdxfacebook.core.FacebookLoginListener listener) {
    de.tomgrill.gdxfacebook.desktop.JXBrowserDesktopFacebookGUI.listener = listener;
    open();
}