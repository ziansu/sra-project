public void drawVerticalRule(int numColumns) {
    breakIfNecessary();
    htmlComponents.add(new HtmlTag("vr", color, (numColumns * (SPACE_WIDTH)), 0));
    if (!(preventDrawing))
        drawHtmlComponents();
    
}