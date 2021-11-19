public org.dbflute.erflute.editor.model.diagram_contents.element.node.table.properties.TableViewProperties getTableViewProperties(java.lang.String database) {
    this.tableViewProperties = org.dbflute.erflute.db.DBManagerFactory.getDBManager(database).createTableProperties(((org.dbflute.erflute.editor.model.diagram_contents.element.node.table.properties.TableProperties) (tableViewProperties)));
    return tableViewProperties;
}