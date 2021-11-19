private void dividePressed(float firstVal, float secondVal) {
    if (secondVal == 0.0) {
        makeToast("Cannot divide by 0");
    }else {
        result = firstVal / secondVal;
        makeToast(result);
    }
}