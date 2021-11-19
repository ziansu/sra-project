@butterknife.OnClick(value = R.id.btn_scan)
private void openQrScanner() {
    android.content.Intent intent = new android.content.Intent(this, com.inveitix.android.clue.scanner.BarcodeCaptureActivity.class);
    intent.putExtra(BarcodeCaptureActivity.AutoFocus, true);
    intent.putExtra(BarcodeCaptureActivity.UseFlash, false);
    startActivityForResult(intent, com.inveitix.android.clue.ui.MapActivity.RC_BARCODE_CAPTURE);
}