@java.lang.Override
public void onDrawerClosed(android.view.View drawerView) {
    updateBufferRead();
    ((com.iskrembilen.quasseldroid.gui.fragments.BufferFragment) (manager.bufferFragment)).finishActionMode();
    setTitleAndMenu();
}