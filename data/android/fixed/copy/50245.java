public void setPacks(org.apache.pivot.collections.List<dcp.logic.model.Pack> packs) {
    this.packs.clear();
    for (dcp.logic.model.Pack p : packs) {
        this.packs.add(new dcp.logic.model.Pack(p));
    }
}