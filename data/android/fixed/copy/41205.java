@java.lang.Override
public void collectStatistics(java.util.Collection<org.sosy_lab.cpachecker.core.interfaces.Statistics> statsCollection) {
    super.collectStatistics(statsCollection);
    algorithm.collectStatistics(statsCollection);
}