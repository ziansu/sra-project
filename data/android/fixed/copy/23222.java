private boolean shouldCache(gw.lang.reflect.gs.ICompilableType gsClass) {
    return (gsClass != null) && (!(gsClass.getName().startsWith(Gosu.GOSU_SCRATCHPAD_FQN)));
}