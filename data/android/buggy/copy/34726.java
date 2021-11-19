public java.lang.String[] valuesToArray() {
    java.lang.String[] valuesArr = new java.lang.String[size];
    generateValuesArray(root, valuesArr, 0);
    return valuesArr;
}