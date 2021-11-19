public static void unloadAssets(java.lang.String sceneName) {
    java.util.List<com.badlogic.gdx.assets.AssetDescriptor> assets = com.suiton2d.assets.AssetManager.assetMap.get(sceneName);
    if (assets != null) {
        for (com.badlogic.gdx.assets.AssetDescriptor asset : assets)
            com.suiton2d.assets.AssetManager.manager.unload(asset.fileName);
        
    }
}