public static final boolean extractSupportIncludedViews(final de.metas.ui.web.view.IViewRow row, final de.metas.ui.web.view.IViewRowOverrides rowOverrides) {
    if (rowOverrides != null) {
        if ((rowOverrides.getIncludedViewId()) != null) {
            return true;
        }
    }
    return row.hasIncludedView();
}