public void reset() {
    setValue(startValue);
    currentElement = 0;
    currentTween = tweens.get(0);
    currentTween.setValue(startValue);
}