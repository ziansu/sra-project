private boolean hoverIntersectControls() {
    return ((isScrollNeeded()) && ((itemHovered.rect) != null)) && ((itemHovered.rect.intersects(rectUp)) || (itemHovered.rect.intersects(rectDown)));
}