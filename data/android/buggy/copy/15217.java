private void readFromParcel(android.os.Parcel in) {
    root = in.readString();
    in.readStringList(subDirs);
}