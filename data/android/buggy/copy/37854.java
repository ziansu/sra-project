public boolean isReferedStrictly() {
    for (final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn column : this.getForeignKeyColumns()) {
        if (column.isReferedStrictly()) {
            return true;
        }
    }
    return false;
}