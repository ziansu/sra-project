public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    saveData();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ast.blocksave.DashboardActivity.class);
    startActivity(intent);
}