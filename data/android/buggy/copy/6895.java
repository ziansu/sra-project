public static void createCompositeFile(javax.swing.JFrame parent, java.io.File[] inputFileArray, java.io.File outputFile) {
    new org.fhaes.tools.FHOperations(parent, inputFileArray, outputFile, 0, 0, 1.0, org.fhaes.enums.FireFilterType.NUMBER_OF_EVENTS, false, true, false, 1, null);
}