private boolean isFooterPosition(int position) {
    return (hasFooterView()) && (position == ((getItemCount()) - 1));
}