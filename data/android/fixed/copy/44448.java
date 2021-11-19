public void excludePms(org.pm4j.core.pm.PmObject... pms) {
    excludePms(new org.pm4j.core.pm.impl.PmMatcherBuilder().pm(pms).build());
}