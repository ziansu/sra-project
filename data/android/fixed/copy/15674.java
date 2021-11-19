public void assertField(org.aptivate.web.utils.HtmlIterator i) {
    java.lang.String value = getValue();
    if (value == null) {
        return ;
    }
    i.assertInput(getName(), getValue());
    i.assertText(getValue());
}