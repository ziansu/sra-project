public htmlflow.elements.HtmlHead<T> scriptLink(java.lang.String src) {
    addChild(new htmlflow.elements.HtmlScriptLink<T>(src));
    return this;
}