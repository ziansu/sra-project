@java.lang.Override
public void readToServerData(io.netty.buffer.ByteBuf bytes) {
    super.readToServerData(bytes);
    shouldProcess = true;
    java.lang.System.out.println(("shouldProcesss: " + (shouldProcess)));
    revealBlocks = false;
}