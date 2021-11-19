@java.lang.Override
protected boolean isUnknown() {
    if ((this.queryAvailableFields) != null) {
        return (com.opendoorlogistics.core.utils.strings.Strings.containsStandardised(getValue(), java.util.Arrays.asList(this.queryAvailableFields.queryAvailableDatastores()))) == false;
    }
    return false;
}