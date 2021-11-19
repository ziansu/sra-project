public boolean isOperandsListChanged() {
    if ((operandsListModel.getSize()) != (model.getSelectedConstraintBlock().getOperands().size()))
        return false;
    
    return true;
}