public void removeRange(int rowNumber, boolean problematicCheckboxSelected) {
    rangeOfKanjiInRow.remove(rowNumber);
    recalculateSumOfKanji(problematicCheckboxSelected);
    learningStartPanel.updateSumOfWords(getSumOfWords());
}