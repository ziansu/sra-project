public void replaceFragment(int fragmentContainerResId, android.support.v4.app.Fragment fragment) {
    ((android.support.v4.app.FragmentActivity) (activity)).getSupportFragmentManager().beginTransaction().replace(fragmentContainerResId, fragment).commit();
}