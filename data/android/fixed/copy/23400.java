@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.marz.snapprefs.PaintTools.width = seekBar2.getProgress();
    if ((com.marz.snapprefs.PaintTools.width) == 0) {
        com.marz.snapprefs.PaintTools.width = (com.marz.snapprefs.PaintTools.width) + 1;
    }
}