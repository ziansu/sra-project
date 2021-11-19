@java.lang.Override
public spreadsheet.Value getValue(spreadsheet.api.CellLocation location) {
    spreadsheet.Cell c = getCellAt(location);
    return c != null ? c.getVal() : new spreadsheet.InvalidValue("");
}