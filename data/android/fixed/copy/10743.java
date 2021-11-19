private void detectTouchEventConsumed() {
    if ((headerLayoutParams.height) > (heightOfActionBar)) {
        clearFocus();
        isTouchEventConsumed = true;
    }else {
        isTouchEventConsumed = false;
    }
}