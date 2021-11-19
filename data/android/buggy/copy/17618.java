@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    fieldPos = 99;
    ydLn = calcYdLn(fieldPos);
    dialog.cancel();
}