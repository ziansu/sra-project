private void sowTrinket(model.editor.engines.Sowing s, model.battlefield.map.Trinket t) {
    t.drawOnBattlefield();
    s.toGrow.add(t);
    model.ModelManager.getBattlefield().store(t);
}