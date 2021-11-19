public boolean isOperationsListChange() {
    if ((operationsListModel.getSize()) != (model.getSelectedOperationBlocks().getOperationSize()))
        return false;
    
    return true;
}