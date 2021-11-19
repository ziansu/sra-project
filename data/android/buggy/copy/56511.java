@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(this.uID);
    parcel.writeString(this.firstName);
    parcel.writeString(this.lastName);
    parcel.writeString(this.currency);
}