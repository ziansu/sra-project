private void setStorageFile() {
    java.io.File storageDirectory = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    storageDirectory.mkdir();
    imagePath = (((getString(R.string.app_name)) + ".") + (com.jets.medicalreminder.edit.EditMedicineFragment.IMAGE_FORMAT)) + storageDirectory;
}