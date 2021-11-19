@java.lang.Override
public void onPixelUnselected() {
    pixelColorView.setBackgroundColor(android.graphics.Color.parseColor("#FFFFFFFF"));
    pixelColorSeekbar.setProgress(0);
    pixelColorNumber.setText("");
    pixelXText.setText("");
    pixelYText.setText("");
}