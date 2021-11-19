@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "open camera", Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
    startActivityForResult(intent, unical.master.computerscience.yellit.graphic.Activities.SignUpActivity.TAKE_PICTURE);
}