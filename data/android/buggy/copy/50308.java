public org.eclipse.dawnsci.analysis.dataset.slicer.SliceInformation getCurrentSliceInformation() {
    return new org.eclipse.dawnsci.analysis.dataset.slicer.SliceInformation(input.get(current), output.get(current), subsampling, shape, dataDims, max, current);
}