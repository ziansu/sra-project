@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(getAbsolutePath());
    dest.writeBooleanArray(new boolean[]{ isSelected , isParent });
}