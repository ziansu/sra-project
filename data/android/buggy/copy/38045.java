public boolean checkActualityOfConditions() {
    if ((this.conditions.size()) == 0) {
        warnings.put("no_conditions", "The task was set in disabled status, because it dosn't have conditions");
        return false;
    }
    return true;
}