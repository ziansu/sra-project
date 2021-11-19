public void pauseMenu(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.Popupmenu.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    pausestuff();
    startActivity(intent);
}