@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(this.name);
    parcel.writeInt(this.cant);
}