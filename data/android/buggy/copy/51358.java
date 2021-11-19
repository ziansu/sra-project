@java.lang.Override
public void onBackPressed() {
    android.app.FragmentManager fm = getFragmentManager();
    fm.popBackStack(null, android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
}