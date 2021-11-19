public void setPeaks(java.util.List<uk.ac.diamond.scisoft.analysis.fitting.functions.IdentifiedPeak> peaksId) {
    org.dawnsci.plotting.tools.finding.IPeakOpportunity peakOpp = new org.dawnsci.plotting.tools.finding.PeakOppurtunity();
    peakOpp.setPeaksId(peaksId);
    everythingChangesListeners(new org.dawnsci.plotting.tools.finding.PeakOpportunityEvent(this, peakOpp));
}