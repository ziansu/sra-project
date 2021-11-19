@java.lang.Override
public void onComplete(me.lolevsky.nasaplanetary.model.MainScreenModule model) {
    mainViewAdapter.setList(model.getEntityList());
}