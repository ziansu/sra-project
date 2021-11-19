@java.lang.Override
public void init(com.badlogic.gdx.assets.AssetManager mAssetManager) {
    com.badlogic.gdx.graphics.Texture mBulletTexture = mAssetManager.get("png/redBullet.png");
    mSprite = new com.badlogic.gdx.graphics.g2d.Sprite(mBulletTexture);
}