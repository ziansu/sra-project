public boolean addFilters(java.util.Collection<com.github.wz2cool.dynamic.FilterDescriptorBase> newFilters) {
    if (newFilters == null) {
        return false;
    }
    return filters.addAll(newFilters);
}