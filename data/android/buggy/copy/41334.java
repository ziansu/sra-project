public void show(android.support.v4.app.FragmentManager fragmentManager, @android.support.annotation.IdRes
int viewId) {
    fragmentManager.beginTransaction().add(viewId, this).commit();
}