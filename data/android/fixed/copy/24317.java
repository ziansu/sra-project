public void pauseMenu(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.Popupmenu.class);
    pausestuff();
    startActivity(intent);
}