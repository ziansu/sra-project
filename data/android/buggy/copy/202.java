public void assertItemsLeft(int count) {
    listElementWithText(byCSS("#todo-count>strong"), java.lang.Integer.toString(count));
}