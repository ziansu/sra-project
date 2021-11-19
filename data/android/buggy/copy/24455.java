@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent gallery = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    gallery.setType("image/*");
    gallery.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(gallery, de.mpg.mpdl.www.datacollector.app.Workflow.WorkflowSectionFragment.INTENT_PICK_PHOTO);
    meta.setType("image");
}