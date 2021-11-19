public void dispose() {
    for (java.awt.Graphics2D g : graphicCache.values()) {
        g.dispose();
    }
    graphicCache.clear();
}