@java.lang.Override
public void write(java.io.DataOutput out) throws java.io.IOException {
    out.writeInt(this.workUnits.size());
    for (gobblin.source.workunit.WorkUnit workUnit : this.workUnits) {
        workUnit.write(out);
    }
    super.write(out);
}