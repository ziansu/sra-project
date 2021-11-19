public void setCodes(java.lang.String fileName) {
    java.lang.System.out.println("Set codes");
    java.lang.System.out.println(fileName);
    codes = lv.edi.EDI_3DAtA.common.DenseMatrixConversions.loadCSVtoDenseMatrix(fileName);
}