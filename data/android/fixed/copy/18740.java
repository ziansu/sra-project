@java.lang.Override
public boolean render(net.minecraft.block.Block block, double x, double y, double z, net.minecraft.client.renderer.RenderBlocks renderblocks) {
    com.peffern.crops.RenderCustomCrop.drawCrossedSquares(block, x, y, z, renderblocks, 0.45, 1.0);
    return true;
}