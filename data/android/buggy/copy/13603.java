@java.lang.Override
protected void onViewCreated(android.os.Bundle savedInstanceState) {
    net.kibotu.android.materialmenu.ViewExtensions.setLayoutMargin(layout, 0, net.kibotu.android.materialmenu.ViewExtensions.getStatusBarHeight(), 0, 0);
    title.setText("Right Drawer Title");
}