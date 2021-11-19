public void assertField(org.aptivate.web.utils.HtmlIterator i) {
    i.assertInput(getName(), getValue());
    i.assertText(getValue());
}