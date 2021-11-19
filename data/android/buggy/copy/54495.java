@java.lang.Override
public void onDeleteIndex(int index) {
    imagePathList.remove(index);
    wallAdapter.notifyRemoved(index);
}