@java.lang.Override
public java.lang.Object getItem(int position) {
    return ((hint) != null) && (position == 0) ? hint : mSpinnerAdapter.getItem(position);
}