@java.lang.Override
public org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn clone() {
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn clone = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) (super.clone()));
    clone.relationshipList = new java.util.ArrayList(this.relationshipList);
    clone.referredColumnList = new java.util.ArrayList<>(this.referredColumnList);
    return clone;
}