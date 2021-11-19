@java.lang.Override
public de.aw.awlib.adapters.AWCursorRecyclerViewAdapter getCursorAdapter() {
    return new de.aw.monma.mainscreen.FragmentDepots.FragmentDepotsCursorAdapter(this, de.aw.monma.mainscreen.FragmentDepots.viewHolderLayout);
}