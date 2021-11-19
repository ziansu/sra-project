private boolean hoverIntersectControls() {
    return (isScrollNeeded()) && ((itemHovered.rect.intersects(rectUp)) || (itemHovered.rect.intersects(rectDown)));
}