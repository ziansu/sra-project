@java.lang.Override
public void modDidActivate(@org.jetbrains.annotations.NotNull
com.sdoras.mods.manager.core.ModManager modManager, @org.jetbrains.annotations.NotNull
com.sdoras.mods.manager.core.Mod mod) {
    this.writeActiveModsToFile(modManager);
    java.lang.System.out.println(java.lang.String.format("Mod '%s' activated.", mod.getModName()));
}