private org.genepattern.server.job.input.ParamListHelper.Record initFromValue(final org.genepattern.server.job.input.ParamValue pval) throws java.lang.Exception {
    return org.genepattern.server.job.input.ParamListHelper.initFromValue(gpConfig, jobContext, this.parameterInfoRecord.getFormal(), pval, false);
}