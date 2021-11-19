public int toRealPosition(int position) {
    if ((count) == 0)
        return -1;
    
    int realPosition = (position - 1) % (count);
    if (realPosition < 0)
        realPosition += count;
    
    return realPosition;
}