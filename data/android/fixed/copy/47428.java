public int onDoStartTag() throws javax.servlet.jsp.JspException {
    java.lang.String p = getName();
    boolean show = showTagBody(p);
    if (show) {
        return javax.servlet.jsp.tagext.TagSupport.EVAL_BODY_INCLUDE;
    }else {
        return javax.servlet.jsp.tagext.TagSupport.SKIP_BODY;
    }
}