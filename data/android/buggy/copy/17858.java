private KLVPacket.Header getPrimerPackHeader() throws java.io.IOException {
    com.netflix.imflibrary.IMFErrorLogger imfErrorLogger = new com.netflix.imflibrary.IMFErrorLoggerImpl();
    return this.getHeaderPartition().getPrimerPack().getHeader();
}