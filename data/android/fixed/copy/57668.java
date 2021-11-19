protected void draw(java.awt.Graphics2D g2d) {
    if (hasIndex)
        geogebra.euclidian.Drawable.drawIndexedString(view.getApplication(), g2d, text, 0, 0, false);
    else
        g2d.drawString(text, 0, 0);
    
}