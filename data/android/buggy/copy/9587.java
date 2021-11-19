@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    switch (v.getId()) {
        case R.id.relative_from :
            imageCenterScreen.setImageDrawable(blackFlag);
            break;
        case R.id.relative_to :
            imageCenterScreen.setImageDrawable(greenFlag);
            break;
    }
    return false;
}