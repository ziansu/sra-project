@java.lang.Override
public long getItemId(int position) {
    return ((hint) != null) && (position == 0) ? 0 : mSpinnerAdapter.getItemId(position);
}