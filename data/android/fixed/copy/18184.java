@java.lang.Override
public long getItemId(int position) {
    return position >= (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA) ? adapter.getItemId((position - (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA))) : position - (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA);
}