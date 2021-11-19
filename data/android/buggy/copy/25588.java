@java.lang.Override
protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
    return new org.apache.drill.exec.planner.physical.ScanPrel(this.getConvention(), this.getCluster(), this.getTraitSet(), org.apache.drill.exec.planner.physical.ScanPrel.getCopy(groupScan), this.rowType, this.getTable());
}