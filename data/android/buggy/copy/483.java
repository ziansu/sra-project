public void defectsB_actionPerformed(java.awt.event.ActionEvent e) {
    cardLayout1.show(panel, "DAILYITEMS");
    dailyItemsPanel.selectPanel("DEFECTS");
    setCurrentButton(defectsB);
    net.sf.memoranda.util.Context.put("CURRENT_PANEL", "DEFECTS");
}