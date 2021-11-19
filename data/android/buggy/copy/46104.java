@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeDouble(this.value);
    dest.writeString(this.currency);
}