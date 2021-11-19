public petablox.program.SootMethod getThreadStartMethod() {
    if (petablox.project.Config.isExcludedFromScope("java.")) {
        petablox.project.Messages.log("WARNING: java. is excluded from scope - hence returning null for ThreadStartMethod.");
        return null;
    }else
        return getMethod("<java.lang.Thread: void start()>");
    
}