private java.util.List<org.hisp.dhis.validation.ValidationResult> orderedList(java.util.Collection<org.hisp.dhis.validation.ValidationResult> results) {
    java.util.List<org.hisp.dhis.validation.ValidationResult> resultList = new java.util.ArrayList(results);
    java.util.Collections.sort(resultList);
    return resultList;
}