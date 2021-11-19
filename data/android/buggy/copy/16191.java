@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, de.huk_coburg.tdp.activities.GalleryActivity.class);
    startActivityForResult(android.content.Intent.createChooser(intent, getString(R.string.choose_image)), CallbackID.EXT_IMAGE);
}