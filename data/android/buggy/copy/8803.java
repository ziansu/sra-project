private boolean isValidOtherDigitGrouping(java.lang.String[] splitCCN) {
    if ((splitCCN.length) == 1) {
        return true;
    }else {
        return (splitCCN[0].length()) == 4;
    }
}