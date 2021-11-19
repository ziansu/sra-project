private java.lang.String compileAndExportExterns(java.lang.String js, java.lang.String externs) {
    js = com.google.javascript.jscomp.LINE_JOINER.join("var goog = {};", "goog.exportSymbol = function(a, b) {};", "goog.exportProperty = function(a, b, c) {};", js);
    testSame(externs, js);
    return getLastCompiler().getResult().externExport;
}