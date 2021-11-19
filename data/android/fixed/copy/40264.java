@java.lang.Override
public void OnPageChanged(int oldPosition, int newPosition) {
    int size = mLayoutAdapter.getItemCount();
    if ((size > 1) && (newPosition == (size - 1))) {
    }
}