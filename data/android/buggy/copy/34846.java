private javax.swing.JMenuItem createSetArgMenuItem(edu.brandeis.cs.nlp.mae.model.Tag tag, java.lang.String label, int mnemonic) {
    edu.brandeis.cs.nlp.mae.controller.MaeActionI setArgAction = getSetArgTagAction(label, mnemonic);
    javax.swing.JMenuItem setArgItem = new javax.swing.JMenuItem(setArgAction);
    setArgItem.setActionCommand(tag.getId());
    return setArgItem;
}