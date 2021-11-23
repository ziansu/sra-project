@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(this.server);
    out.writeString(this.email);
    out.writeString(this.token);
    out.writeValue(this.is_shib);
}