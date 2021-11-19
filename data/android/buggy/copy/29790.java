@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    osmMap.deleteNode();
    dialogInterface.dismiss();
    proportionMapAndList(100, 0);
}