@java.lang.Override
public void readExternal(java.io.ObjectInput in) throws java.io.IOException, java.lang.ClassNotFoundException {
    super.readExternal(in);
    mNickname = ((java.lang.String) (in.readObject()));
    mUserId = in.readLong();
}