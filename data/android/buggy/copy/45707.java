public void onTick(long millisUntilFinished) {
    if ((Circle.numCorrect) == (Circle.TARGET)) {
        onFinish();
    }
}