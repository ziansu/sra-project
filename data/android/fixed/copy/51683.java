@java.lang.Override
public org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn clone() {
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn clone = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.column.NormalColumn) (super.clone()));
    clone.relationshipList = new java.util.ArrayList(relationshipList);
    clone.referredColumnList = new java.util.ArrayList<>(referredColumnList);
    return clone;
}