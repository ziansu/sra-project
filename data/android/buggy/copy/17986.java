@java.lang.Override
public boolean createDirectory(java.lang.String path, boolean recursive) throws org.apache.thrift.TException, tachyon.thrift.FileAlreadyExistException, tachyon.thrift.TachyonException {
    mFileSystemMaster.mkdirs(new tachyon.TachyonURI(path), recursive);
}