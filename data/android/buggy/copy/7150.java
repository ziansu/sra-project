public void reset() {
    previousValue = currentValue = startValue;
    currentElement = 0;
    currentTween = tweens.get(0);
    currentTween.setValue(startValue);
}