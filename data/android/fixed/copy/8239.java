com.z299studio.pb.Application.FileHeader getAppHeaderData(android.content.Context context) {
    if ((mBuffer) == null) {
        getData(context);
    }
    if ((mBuffer) != null) {
        mFileHeader = com.z299studio.pb.Application.FileHeader.parse(mBuffer);
        mLocalVersion = mFileHeader.revision;
    }
    return mFileHeader;
}