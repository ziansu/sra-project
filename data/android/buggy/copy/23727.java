public final void saveSettings() {
    tagsModel.applyToTags(buildings_tools.ToolSettings.getTags(), false);
    buildings_tools.ToolSettings.saveTags();
    buildings_tools.ToolSettings.setBBMode(cBigMode.isSelected());
    buildings_tools.ToolSettings.setSoftCursor(cSoftCur.isSelected());
}