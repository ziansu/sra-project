private int isHeader(com.google.gwt.dom.client.Element target) {
    if ((target.getParentElement()) != null) {
        return jsniUtil.isHeader(target.getParentElement().getAttribute("class"));
    }else {
        return 0;
    }
}