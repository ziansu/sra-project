public synthesijer.ast.Module searchModule(java.lang.String name) {
    synthesijer.Manager.SynthesijerModuleInfo info = modules.get(name);
    return info.m;
}