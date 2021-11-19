private void setComboBoxModel(org.miradi.objecthelpers.DateUnit dateUnit) {
    java.lang.Object[] choiceItems = getChoiceItems(dateUnit);
    removeAllItems();
    java.util.Arrays.sort(choiceItems);
    setModel(new javax.swing.DefaultComboBoxModel(choiceItems));
}