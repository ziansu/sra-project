@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    out.writeSerializable(direction);
    super.writeToParcel(out, flags);
}