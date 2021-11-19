private void setNumExamples(int numExamples) {
    int oldNumExamples = this.numExamples;
    this.numExamples = numExamples;
    propertyChangeSupport.firePropertyChange(wekimini.Path.PROP_NUMEXAMPLES, oldNumExamples, numExamples);
}