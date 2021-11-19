private static void showMessagePopup(android.content.Context context, java.lang.String message, android.content.DialogInterface.OnClickListener listener) {
    new android.app.AlertDialog.Builder(context).setMessage(message).setCancelable(false).setNegativeButton(R.string.ok, listener).show();
}