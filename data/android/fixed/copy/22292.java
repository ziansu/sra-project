@java.lang.Override
public com.hourglassapps.cpi_ii.report.Batch next() {
    try {
        mPhrases.reset();
        return new com.hourglassapps.cpi_ii.report.Batch(mPhrases, mNextBatch, mNextPhrase);
    } finally {
        mNextPhrase = nextBatch(mNextPhrase);
    }
}