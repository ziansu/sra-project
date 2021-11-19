@java.lang.Override
public void onClick(android.view.View v) {
    drawView.setPaintMode(true);
    drawView.setEraseMode(true);
    v.setBackgroundResource(R.mipmap.ic_eraser_pressed);
    mPaintButton.setBackgroundColor(Color.TRANSPARENT);
    mHandButton.setBackgroundResource(R.mipmap.ic_hand);
}