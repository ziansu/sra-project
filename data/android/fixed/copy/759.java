private boolean includeRow(main.xls.poi.HSSFCell cell, java.lang.String group) {
    return (isRowGroupNonSpecific(cell)) || (isRowRelatedToSelectedGroup(cell, group));
}