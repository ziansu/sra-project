public void setSize(groovy.lang.IntRange maxSize) {
    this.maxSize = maxSize.getTo();
    this.minSize = maxSize.getFrom();
}