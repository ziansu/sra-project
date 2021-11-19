public int transformX(int screenWidth) {
    int trueX = position.width;
    if (trueX == 0)
        trueX = screenWidth;
    
    return positionType.transformX(position.x, (screenWidth - trueX));
}