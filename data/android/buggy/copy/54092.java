static maxim.z.FileSystem getFileSystem(maxim.z.BytesReaderWriter readerWriter) throws java.io.IOException {
    int clusterCount = maxim.z.FileSystem.readClusterCount(readerWriter);
    int clusterSize = maxim.z.FileSystem.readClusterSize(readerWriter);
    return new maxim.z.FileSystem(readerWriter, clusterCount, clusterSize);
}