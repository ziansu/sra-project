@java.lang.Override
public void read(io.netty.buffer.ByteBuf buffer) {
    if (buffer.readBoolean()) {
        playerHook = com.builtbroken.grappling.content.Hook.read(buffer);
    }
}