public static byte[] pack(io.github.antijava.marjio.network.Status status) throws java.io.IOException {
    return io.github.antijava.marjio.network.Status__JsonHelper.serializeToJson(status.PreparePack()).getBytes("UTF-8");
}