public java.lang.Boolean availablePosition(int position) {
    if (((position >= 0) && (position <= (dimension))) && ((state.charAt(position)) == '-')) {
        return true;
    }
    return false;
}