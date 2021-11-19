public void addHost(java.lang.String policyUnit, org.ovirt.engine.core.compat.Guid host, java.lang.Integer score) {
    if ((hostsWithScores) == null) {
        hostsWithScores = new java.util.ArrayList<>();
    }
    hostsWithScores.add(new org.ovirt.engine.core.bll.scheduling.external.WeightResultEntry(host, score, policyUnit));
}