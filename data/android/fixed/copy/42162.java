private boolean styleContains(java.lang.String state) {
    java.lang.String style = getStyle();
    if ((style == null) || (state == null))
        return false;
    
    return style.contains(state);
}