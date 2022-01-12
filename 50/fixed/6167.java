public boolean isLowerCaseTableNames() {
    java.lang.Integer value = java.lang.Integer.valueOf(globalVariables.get("lower_case_table_names").getVariable());
    return value != 0 ? true : false;
}