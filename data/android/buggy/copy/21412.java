@java.lang.Override
public int getItemViewType(int position) {
    return position == 0 ? (getViewTypeCount()) - (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA) : adapter.getItemViewType((position - (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA)));
}