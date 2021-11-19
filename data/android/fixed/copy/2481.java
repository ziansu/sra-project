@java.lang.Override
public void registerCodingSchemeEntityIndex(java.lang.String codingSchemeUri, java.lang.String version) {
    org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference ref = new org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference();
    ref.setCodingSchemeURN(codingSchemeUri);
    ref.setCodingSchemeVersion(version);
    indexCreator.index(ref, null, false);
}