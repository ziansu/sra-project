private boolean hasViewReorderEnabled(android.view.View v) {
    return (v != null) && (true != (v.getTag(org.askerov.dynamicgrid.DynamicGridView.TAG_REORDER_DISABLED)));
}