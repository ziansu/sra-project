@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    spUtil.saveGpsInterval(values[i]);
    dialogInterface.dismiss();
    tvGpsInterval.setText(((items[i]) + " ms"));
}