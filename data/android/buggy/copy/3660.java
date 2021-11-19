public static com.streamsets.pipeline.lib.io.LiveFile getRefreshedLiveFileFromFileOffset(java.lang.String fileOffset) throws java.io.IOException {
    return com.streamsets.pipeline.lib.util.FileContextProviderUtil.getLiveFileFromFileOffset(fileOffset).refresh();
}