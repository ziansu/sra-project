public htmlflow.elements.HtmlHead<T> title(final java.lang.String msg) {
    this.addChild(new htmlflow.elements.HtmlTitle<T>()).text(msg);
    return this;
}