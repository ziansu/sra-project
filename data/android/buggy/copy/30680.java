private int getRealPosition(int position, int totalCount) {
    if (position < 0) {
        return (position % totalCount) + totalCount;
    }else {
        return position % totalCount;
    }
}