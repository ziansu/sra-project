public htmlflow.elements.HtmlHead<T> linkCss(java.lang.String href) {
    addChild(new htmlflow.elements.HtmlLinkCss<T>(href));
    return this;
}