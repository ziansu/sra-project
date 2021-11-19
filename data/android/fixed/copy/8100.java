@java.lang.Override
public void onClick(android.view.View v) {
    doodleView.setPenColor(tempColor);
    doodleView.setPenWidth(tempProgress);
    selectDialog.dismiss();
}