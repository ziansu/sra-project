public static final boolean extractSupportIncludedViews(final de.metas.ui.web.view.IViewRow row, final de.metas.ui.web.view.IViewRowOverrides rowOverrides) {
    if (rowOverrides != null) {
        return (rowOverrides.getIncludedViewId()) != null;
    }else {
        return row.hasIncludedView();
    }
}