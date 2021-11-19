@java.lang.Override
public void collectStatistics(java.util.Collection<org.sosy_lab.cpachecker.core.interfaces.Statistics> statsCollection) {
    super.collectStatistics(statsCollection);
    if ((algorithm) instanceof org.sosy_lab.cpachecker.core.interfaces.StatisticsProvider) {
        ((org.sosy_lab.cpachecker.core.interfaces.StatisticsProvider) (algorithm)).collectStatistics(statsCollection);
    }
}