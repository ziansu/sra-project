public com.shc.silenceengine.core.ResourceLoader setLogo(com.shc.silenceengine.graphics.opengl.Texture logo) {
    if ((this.logo) != null)
        this.logo.dispose();
    
    this.logo = logo;
    return com.shc.silenceengine.core.ResourceLoader.instance;
}