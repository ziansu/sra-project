public soottocfg.cfg.method.CfgBlock findBlock(soot.Unit u) {
    if (!(unitToBlockMap.containsKey(u))) {
        return unitToBlockMap.get(u);
    }
    return null;
}