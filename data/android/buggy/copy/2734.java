private void updateMinSize(int newMinSize) throws Exceptions.HadoopConfException {
    root = new analyser.Node("/", 0, 0, "/");
    this.minSize = newMinSize;
    this.isInitilized = false;
    init(newMinSize);
}