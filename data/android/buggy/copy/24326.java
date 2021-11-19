private void rescaleMap() {
    int defaultHexRadius = 50;
    hexRadius = ((int) (defaultHexRadius * (scale)));
    hexWidth = (hexRadius) * 2;
    hexHeight = ((int) ((hexRadius) * 1.748));
}