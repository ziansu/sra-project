@net.minecraftforge.fml.common.Mod.EventHandler
public void afterStart(net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent event) {
    cd4017be.api.recipes.RecipeScriptContext.instance = null;
    cd4017be.lib.script.Compiler.deallocate();
    java.lang.System.gc();
}