@java.lang.Override
public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    super.writeExternal(out);
    out.writeLong(mUserId);
    out.writeLong(mRegionId);
}