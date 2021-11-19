@java.lang.Override
public void onClick(android.view.View v) {
    imageIntent.setType("image/*");
    imageIntent.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(android.content.Intent.createChooser(imageIntent, "Select photo"), 0);
}