@java.lang.Override
public java.lang.Object getItem(int position) {
    position = ((hint) != null) ? position - 1 : position;
    return position == (-1) ? hint : mSpinnerAdapter.getItem(position);
}