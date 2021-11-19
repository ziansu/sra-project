public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putFloat(com.idonans.app.DoodleActionPanel.EXTRA_SIZE, mSize);
    outState.putInt(com.idonans.app.DoodleActionPanel.EXTRA_ALPHA, mAlpha);
    outState.putInt(com.idonans.app.DoodleActionPanel.EXTRA_COLOR, mColor);
    outState.putInt(com.idonans.app.DoodleActionPanel.EXTRA_BRUSH_TYPE, mBrushType);
}