@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent photoPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    photoPickerIntent.setType("image/*");
    startActivityForResult(photoPickerIntent, com.vyn.motoclick.activities.MapsActivity.REQUEST);
}