protected void showMessageDialog(java.lang.String title, java.lang.String msg, java.lang.String posString, android.content.DialogInterface.OnClickListener onClickListener) {
    new android.app.AlertDialog.Builder(getApplicationContext()).setTitle(title).setMessage(msg).setPositiveButton(posString, onClickListener).show();
}