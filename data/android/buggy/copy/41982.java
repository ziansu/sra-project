public void spawnPartModel(org.json.JSONObject equipletCommand, HAL.listeners.EquipletCommandListener listener) {
    this.forwardTarget = listener;
    this.getRosInterface().postEquipletCommand(equipletCommand);
}