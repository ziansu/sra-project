@java.lang.Override
public int getViewTypeCount() {
    return (adapter.getViewTypeCount()) + (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA);
}