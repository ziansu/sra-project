@java.lang.Override
public boolean shouldFilter() throws java.lang.Exception {
    return (filteredSlbIds != null) || (slbQuery.hasValue(slbQuery.id));
}