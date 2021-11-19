public void onDestroy() {
    super.onDestroy();
    mOpenCvCameraView.disableView();
    dropTable();
    db.close();
}