@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(nl.adaptivity.process.ui.model.ProcessModelDetailFragment.ARG_ITEM_ID)) {
        getLoaderManager().initLoader(nl.adaptivity.process.ui.model.ProcessModelDetailFragment.LOADER_ITEM, getArguments(), this);
    }
    setHasOptionsMenu(true);
}