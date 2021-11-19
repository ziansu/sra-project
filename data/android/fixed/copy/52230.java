public java.lang.Boolean availablePosition(int position) {
    return ((position >= 0) && (position <= (dimension))) && ((state.charAt(position)) == '-');
}