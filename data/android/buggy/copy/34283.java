public static org.newdawn.slick.opengl.Texture QuickLoadTexture(java.lang.String name, java.lang.String path) {
    org.newdawn.slick.opengl.Texture tex = null;
    tex = com.Jakibah.Carbon.Utilities.Draw.loadTexture(((("com/Jakibah/Carbon/Res/textures/" + path) + name) + ".png"), "PNG");
    return tex;
}