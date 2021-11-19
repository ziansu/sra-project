@java.lang.Override
protected boolean isUnknown() {
    if ((queryAvailableFields) != null) {
        return (com.opendoorlogistics.core.utils.strings.Strings.containsStandardised(getValue(), java.util.Arrays.asList(queryAvailableFields.queryAvailableDatastores()))) == false;
    }
    return false;
}