@java.lang.Override
public void run() {
    listView.smoothScrollBy((viewTop - ((mRootLayoutHeight) / 3)), 1000);
    highLightMiddleRow(listView, view, adapter, currentPosInMiddle);
}