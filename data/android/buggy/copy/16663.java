public void setInnerText(java.lang.String setThisText) {
    super.clear();
    super.add(currentActiveLabel);
    this.setupLabel(setThisText, currentActiveLabel);
}