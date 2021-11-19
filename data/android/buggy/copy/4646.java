public static void load() {
    com.github.bot.curiosone.app.chat.helpers.AssetLoader.skin = new com.badlogic.gdx.scenes.scene2d.ui.Skin();
    com.github.bot.curiosone.app.chat.helpers.AssetLoader.send = new com.badlogic.gdx.graphics.Texture(Gdx.files.internal("chat-asset/send.png"));
    com.github.bot.curiosone.app.chat.helpers.AssetLoader.skin.add("send", com.github.bot.curiosone.app.chat.helpers.AssetLoader.send);
}