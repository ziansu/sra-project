@java.lang.Override
public net.minecraft.client.renderer.texture.TextureAtlasSprite getSprite(boolean pollinated, boolean fancy) {
    if (pollinated) {
        return leafTexture.getPollinated();
    }else
        if (fancy) {
            return leafTexture.getFancy();
        }else {
            return leafTexture.getPlain();
        }
    
}