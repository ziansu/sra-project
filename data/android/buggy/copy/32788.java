public void setTypeIgnored(int i, boolean ignore) {
    if (i > (atomData.getCrystalStructure().getNumberOfTypes()))
        return ;
    
    ignoreTypes[i] = ignore;
}