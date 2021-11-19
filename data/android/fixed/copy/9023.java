@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    me.nereo.multi_image_selector.MultiImageSelector.create().single().start(this, Config.REQUEST_IMAGE_CODE);
    dismissDialog();
}