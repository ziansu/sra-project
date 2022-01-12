@java.lang.Override
protected org.nextprot.api.core.app.dbxrefanalyser.DbXrefUrlTester newDbXrefUrlTester() throws java.io.IOException {
    return new org.nextprot.api.core.app.dbxrefanalyser.DbXrefUrlTester(((getOutputDirectory()) + "/allentries-xrefs-url.tsv"));
}