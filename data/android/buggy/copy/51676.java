static final ch.njol.skript.ScriptLoader.ScriptInfo unloadScripts(final java.io.File folder) {
    final ch.njol.skript.ScriptLoader.ScriptInfo r = ch.njol.skript.ScriptLoader.unloadScripts_(folder);
    ch.njol.skript.lang.function.Functions.validateFunctions();
    return r;
}