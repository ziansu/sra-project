@java.lang.SuppressWarnings(value = "unchecked")
private boolean setSelection(java.util.Set<T_ITEM> selectedItems) {
    return setSelection((selectedItems.isEmpty() ? selection = ((org.pm4j.common.selection.ItemSetSelection<T_ITEM>) (org.pm4j.common.selection.ItemSetSelectionHandler.EMPTY_SELECTION)) : new org.pm4j.common.selection.ItemSetSelection<T_ITEM>(selectedItems)));
}