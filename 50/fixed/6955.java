@java.lang.Override
public void onDidLoadView() {
    setFullScreen();
    initMenu();
    initContentView();
    refreshListDataFromNet();
}