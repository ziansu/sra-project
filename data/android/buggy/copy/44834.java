public void executeCommand() {
    VASL.build.module.OBA.Module mod = oba.getModuleAt(index);
    if (mod != null) {
        state = mod.getState();
        oba.removeModule(mod);
    }
}