@java.lang.Override
public void readExternal(java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
    super.readExternal(in);
    mUserId = in.readLong();
    mRegionId = in.readLong();
}