@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    super.writeToParcel(out, flags);
    out.writeSerializable(direction);
}