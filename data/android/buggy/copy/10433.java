public void showSimpleSnackbar(int mainTextResource, boolean shortLength) {
    android.view.View root = findViewById(R.id.root_layout);
    showSnackbar(mainTextResource, shortLength, (-1), null, root);
}