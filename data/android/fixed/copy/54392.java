public boolean hasSubclassOptions() {
    return (classTemplate.isAllowClassTransfer()) && ((level) >= (classTemplate.getClassTransferLevel()));
}