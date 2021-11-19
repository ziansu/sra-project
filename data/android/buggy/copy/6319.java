@java.lang.Override
protected int getIncludedHUsCount() {
    final de.metas.handlingunits.client.terminal.editor.model.impl.HUKey huKey = getHUKey();
    final de.metas.handlingunits.client.terminal.editor.model.impl.HUKeyNameBuilder.HUKeyIncludedHUsCounter includedHUsCounter = new de.metas.handlingunits.client.terminal.editor.model.impl.HUKeyNameBuilder.HUKeyIncludedHUsCounter(huKey, false);
    huKey.iterate(includedHUsCounter);
    return includedHUsCounter.getHUsCount();
}