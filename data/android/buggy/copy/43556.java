@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if (facesDetected) {
        showPanel(com.android.gallery3d.filtershow.category.MainPanel.TRUEPORTRAIT);
    }else {
        v.setEnabled(false);
        com.android.gallery3d.filtershow.tools.TruePortraitNativeEngine.getInstance().showNoFaceDetectedDialog(getFragmentManager());
    }
}