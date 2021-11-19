public void readFromParcel(android.os.Parcel in) {
    timestamp = in.readLong();
    values = new java.util.ArrayList();
    in.readList(values, getClass().getClassLoader());
}