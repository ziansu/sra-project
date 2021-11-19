private void setPhotoFromLibrary() {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    intent.setType("image/*");
    getActivity().startActivityForResult(android.content.Intent.createChooser(intent, "Select File"), SELECT_FILE);
}