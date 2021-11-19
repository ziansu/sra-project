public static org.eclipse.january.dataset.IDataset[] curveStitch4(org.dawnsci.surfacescatter.CurveStitchDataPackage csdp, double[][] maxMinArrayIn) {
    org.eclipse.january.dataset.IDataset[] output = org.dawnsci.surfacescatter.CurveStitchWithErrorsAndFrames.curveStitch4(csdp, maxMinArrayIn, null);
    return output;
}