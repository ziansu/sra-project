private void refreshTitle() {
    java.lang.String title = getString(R.string.online_number);
    setTitle(java.lang.String.format(title, org.puresoftware.chocalandroid.Chocal.getUsers().size()));
}