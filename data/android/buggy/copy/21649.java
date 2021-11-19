public int toRealPosition(int position) {
    int realCount = getRealCount();
    if (realCount == 0)
        return 0;
    
    int realPosition = position % realCount;
    return realPosition;
}