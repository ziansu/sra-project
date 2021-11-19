@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(getClass().getName());
    out.writeLong(timestamp);
    out.writeFloatArray(values);
    out.writeList(valuesList);
}