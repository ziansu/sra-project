@java.lang.Override
public void readToServerData(io.netty.buffer.ByteBuf bytes) {
    super.readToServerData(bytes);
    shouldProcess = true;
    revealBlocks = false;
}