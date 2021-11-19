public void initBroadPeaks() {
    for (cn.j1angvei.castk2.input.Experiment e : this.experiment) {
        e.setBroadPeak(broadPeaks.contains(e.getCode()));
    }
}