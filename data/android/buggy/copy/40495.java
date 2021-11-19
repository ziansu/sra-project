@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeDouble(latitude);
    dest.writeDouble(longitude);
    dest.writeFloat(radius);
}