public void setHue(int rangeValue) {
    if ((hue.getValue()) != rangeValue) {
        hue.setValue(rangeValue);
        setChanged(true);
    }
}