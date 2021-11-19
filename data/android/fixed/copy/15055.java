@java.lang.Override
public long getItemId(int position) {
    position = ((hint) != null) ? position - 1 : position;
    return position == (-1) ? 0 : mSpinnerAdapter.getItemId(position);
}