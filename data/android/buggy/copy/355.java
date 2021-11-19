public boolean matches(org.jacoco.core.analysis.ICoverageNode n) {
    return name.matches(jacoco.report.internal.html.parse.NameCreator.create(n));
}