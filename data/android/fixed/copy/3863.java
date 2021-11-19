@java.lang.Override
public void onClick(android.view.View v) {
    startActivityForResult(android.content.Intent.createChooser(imageIntent, "Select photo"), 0);
}