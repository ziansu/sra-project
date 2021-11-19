public void setEditableSlot(int slot) {
    ASSERT((slot >= 0));
    setSelected(com.js.geometryapp.editor.SlotList.build(slot));
    get(slot).setEditable(true);
    mutate();
}