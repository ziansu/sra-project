public void clear() {
    tweens.clear();
    previousValue = currentValue = startValue = 0.0F;
    currentElement = 0;
    repeat = false;
    enable = true;
    currentTween = new libGame.tween.type.ValueTween(startValue);
    tweens.add(currentTween);
}