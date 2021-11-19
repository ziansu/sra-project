@java.lang.Override
public void deleteTool(java.lang.String toolId) {
    listStore.remove(listStore.findModelWithKey(toolId));
}