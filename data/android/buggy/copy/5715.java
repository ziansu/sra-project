private void loadData() {
    db.openDatabase();
    db.getAllCardsSorted(sortedDescending);
    db.closeDatabase();
    getSupportFragmentManager().beginTransaction().replace(R.id.overviewContainer, overviewFragment).commit();
}