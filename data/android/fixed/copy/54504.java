@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(_id);
    dest.writeString(_title);
    dest.writeString(_text);
    dest.writeInt(_textBitmap.length);
    dest.writeByteArray(_textBitmap);
}