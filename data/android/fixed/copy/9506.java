public org.verapdf.pd.colors.PDColorSpace getColorSpace(org.verapdf.as.ASAtom name) {
    org.verapdf.pd.colors.PDColorSpace colorSpace = this.pageResources.getColorSpace(name);
    if (colorSpace != null) {
        colorSpace.setInherited(inheritedResources);
    }
    return colorSpace;
}