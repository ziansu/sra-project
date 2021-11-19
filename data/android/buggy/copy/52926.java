public void mouseClicked(java.awt.event.MouseEvent evt) {
    jBtnChangeTableType(model.Tabellenart.COMPLETE);
    if (belongsToALeague)
        jCBMatchdays.setSelectedIndex(competition.getCurrentMatchday());
    
    model.Start.getInstance().uebersichtAnzeigen(teamIndices[x]);
}