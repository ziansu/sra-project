private void detectTouchEventConsumed() {
    if ((isFirstViewVisible()) && ((currentHeightOfHeader) > (heightOfActionBar))) {
        clearFocus();
        isTouchEventConsumed = true;
    }else {
        isTouchEventConsumed = false;
    }
}