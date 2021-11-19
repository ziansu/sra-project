public void setName(java.lang.String name) {
    this.name = name;
    this.column_name = org.smap.sdal.Utilities.GeneralUtilityMethods.cleanName(name, true, true);
}