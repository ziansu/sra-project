private static java.lang.String getFilename(java.lang.String title, java.lang.String filename) {
    filename = gdsc.smlm.ij.plugins.BenchmarkFilterAnalysis.getFilename(title, filename);
    if (filename != null)
        filename = gdsc.smlm.ij.utils.Utils.replaceExtension(filename, ".xml");
    
    return filename;
}