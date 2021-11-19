protected void removeLast() {
    if ((getItemCount()) > 0) {
        remove(getLastItemPosition());
    }
}