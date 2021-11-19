public com.shc.silenceengine.core.ResourceLoader setLogo(com.shc.silenceengine.graphics.opengl.Texture logo) {
    logo.dispose();
    this.logo = logo;
    return com.shc.silenceengine.core.ResourceLoader.instance;
}