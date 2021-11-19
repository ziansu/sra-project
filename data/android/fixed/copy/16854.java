protected void scrollToFirstError() {
    int y = getFirstErrorOffset();
    if (y == 0)
        return ;
    
    y -= com.sksamuel.jqm4gwt.form.JQMForm.ERROR_SCROLL_OFFSET;
    if (y < 0)
        y = 0;
    
    com.sksamuel.jqm4gwt.Mobile.silentScroll(y);
}