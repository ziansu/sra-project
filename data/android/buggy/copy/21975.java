public void setExperimentType(org.broad.igv.sam.AlignmentTrack.ExperimentType type) {
    dataManager.setExperimentType(type);
    if ((spliceJunctionTrack) != null) {
        spliceJunctionTrack.setVisible((type != (org.broad.igv.sam.AlignmentTrack.ExperimentType.BISULFITE)));
    }
}