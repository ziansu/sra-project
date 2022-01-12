public void setValue(java.lang.String v) {
    value = v;
    this.column_name = org.smap.sdal.Utilities.GeneralUtilityMethods.cleanName(v, false, false);
}