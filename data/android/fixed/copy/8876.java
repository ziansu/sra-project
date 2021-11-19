@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeValue(item);
    dest.writeValue(getStartTime());
    dest.writeValue(getEndTime());
}