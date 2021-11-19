public float getStringWidth(java.lang.String str, net.malisis.core.renderer.font.FontRenderOptions fro) {
    if (org.apache.commons.lang3.StringUtils.isEmpty(str))
        return 0;
    
    return getStringWidth(str, fro, 0, str.length());
}