@java.lang.Override
public javax.swing.Action[] getActions(boolean context) {
    return new javax.swing.Action[]{ org.openide.util.actions.SystemAction.get(org.openthinclient.console.RefreshAction.class) , org.openide.util.actions.SystemAction.get(org.openthinclient.console.nodes.DirectoryEntryNode.ExportLDIFAction.class) , org.openide.util.actions.SystemAction.get(org.openthinclient.console.nodes.DirectoryEntryNode.ImportLDIFAction.class) , org.openide.util.actions.SystemAction.get(org.openide.actions.DeleteAction.class) };
}