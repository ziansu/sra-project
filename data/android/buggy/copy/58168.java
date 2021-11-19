public java.lang.String getCSV() {
    return (((formatter.format(liquidAssets)) + ", ") + (formatter.format(interestRate))) + ", ";
}