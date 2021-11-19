public static void processIfModified(com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings settings, java.lang.String input, java.lang.String output, java.lang.String packFileName) {
    if (com.badlogic.gdx.tools.texturepacker.TexturePacker.isModified(input, output, packFileName))
        com.badlogic.gdx.tools.texturepacker.TexturePacker.process(settings, input, output, packFileName);
    
}