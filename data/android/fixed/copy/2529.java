private boolean isCell(org.kframework.kore.K k) {
    return (k instanceof org.kframework.kore.KApply) && (cfg.isCell(labelInfo.getCodomain(((org.kframework.kore.KApply) (k)).klabel())));
}