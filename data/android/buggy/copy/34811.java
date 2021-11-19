public java.lang.String getHtmlColor() {
    java.lang.String prefix = "#";
    if ((type) == (Schedule.ROOM))
        return prefix + "CCC";
    
    return color;
}