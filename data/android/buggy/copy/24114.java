public void animateText(java.lang.CharSequence text) {
    this.text = text;
    index = 0;
    setText("");
    handler.removeCallbacks(characterAdder);
    handler.postDelayed(characterAdder, delay);
}