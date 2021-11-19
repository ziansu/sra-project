public void addClickText(java.lang.String text) {
    this.builder.getCurrent().getClickEvent().setValue(text);
    player.openInventory(getClickInventory());
    this.safe = false;
    this.state = com.exoticcode.jsonchatcreator.api.GUISet.GUIState.CLICK_EVENT;
}