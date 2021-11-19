@java.lang.Override
public java.lang.String getRawDataAccession() {
    return isUsProject ? getAnalyzedSampleId() : org.icgc.dcc.common.core.util.Joiners.COLON.join(getAnalyzedFileId(), getMatchedFileId());
}