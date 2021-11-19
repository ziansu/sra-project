@java.lang.Override
public void writeSpawnData(io.netty.buffer.ByteBuf data) {
    net.minecraftforge.fml.common.network.ByteBufUtils.writeUTF8String(data, Block.blockRegistry.getNameForObject(tile).toString());
    data.writeInt(metadata);
}