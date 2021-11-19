@org.junit.Test
public void testGetAbstractValueIntervalState() {
    org.sosy_lab.cpachecker.cpa.interval.IntervalAnalysisState intervalState = new org.sosy_lab.cpachecker.cpa.interval.IntervalAnalysisState().addInterval("x", new org.sosy_lab.cpachecker.cpa.interval.Interval((-1L), 4L), 0);
}