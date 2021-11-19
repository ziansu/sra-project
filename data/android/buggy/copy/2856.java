public void actionPerformed(java.awt.event.ActionEvent e) {
    BudgetPlanModel budget = new BudgetPlanModel();
    DatenVerwaltung ver = new DatenVerwaltung(budget, hm);
    hm.setVisible(false);
}