public boolean hasSubclassOptions() {
    return (classTemplate.isAllowClassTransfer()) && ((classTemplate.getClassTransferLevel()) >= (level));
}