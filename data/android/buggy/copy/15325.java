@java.lang.Override
public void onClick(android.view.View view) {
    dbHandler.deleteHomework(java.lang.Integer.parseInt(dbHandler.getHomework()[position][4]));
    dbHandler.hasHomework();
    dismiss();
}