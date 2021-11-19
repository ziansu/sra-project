public boolean isOperandsListChanged() {
    if ((operandsListModel.getSize()) != (model.getSelectedConstraintBlock().getOperands().size()))
        return true;
    
    return false;
}