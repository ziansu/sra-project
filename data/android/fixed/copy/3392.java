public void trimRight(int delta) {
    length -= delta;
    java.lang.String text = element.getInnerText();
    element.setInnerText(text.substring(0, ((text.length()) - delta)));
}