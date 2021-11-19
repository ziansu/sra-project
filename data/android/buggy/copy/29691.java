@butterknife.OnClick(value = R.id.captureimage)
void take_photo() {
    java.io.File f = dispatchTakePictureIntent();
    Myfiles.add(f.getName());
    Files.add(f.getAbsolutePath());
    myRecycler.notifyDataSetChanged();
}