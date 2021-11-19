@java.lang.Override
public de.skuzzle.enforcer.restrictimports.SourceTreeAnalyzer createAnalyzer() {
    final de.skuzzle.enforcer.restrictimports.IOUtils ioUtils = new de.skuzzle.enforcer.restrictimports.impl.IOUtilsImpl();
    final de.skuzzle.enforcer.restrictimports.ImportMatcher matcher = new de.skuzzle.enforcer.restrictimports.impl.ImportMatcherImpl(ioUtils::lines);
    return new de.skuzzle.enforcer.restrictimports.impl.SourceTreeAnalyzerImpl(matcher, ioUtils);
}