@java.lang.Override
public void show(android.support.v4.app.FragmentManager fragmentManager, java.lang.String tag) {
    fragmentManager.popBackStack();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.add(this, tag);
    fragmentTransaction.commit();
}