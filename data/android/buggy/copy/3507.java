public java.lang.String getSelectedStratgey() {
    stratgeyService.findStratgeyById(clientBean.getSelectedStrategyId()).getValue();
    return selectedStratgey;
}