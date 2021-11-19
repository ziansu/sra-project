private void updateToolbarTitle(android.support.v4.app.Fragment fragment, java.lang.String title) {
    java.lang.String fragmentClassName = fragment.getClass().getName();
    if (fragmentClassName.equals(fragment.getClass().getName())) {
        setTitle(title);
    }
}