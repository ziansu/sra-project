protected void scrollToFirstError() {
    int y = (getFirstErrorOffset()) - (com.sksamuel.jqm4gwt.form.JQMForm.ERROR_SCROLL_OFFSET);
    com.sksamuel.jqm4gwt.Mobile.silentScroll(y);
}