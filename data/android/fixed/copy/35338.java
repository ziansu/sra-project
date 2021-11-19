public int getWarningLowSpaceSize() {
    return ((getWarningLowSpaceIndicator()) == null) || ((getTotalDiskSize()) == null) ? 0 : ((getTotalDiskSize()) * (getWarningLowSpaceIndicator())) / 100;
}