private void readFromParcel(android.os.Parcel in) {
    root = in.readString();
    subDirs = new java.util.ArrayList<>();
    in.readStringList(subDirs);
}