public inventory.item.placeableItem.PlaceableMessage canPlace(level.maps.Level level, int mouseX, int mouseY, entity.mobs.PlayerMob player) {
    if ((player.getMaxHealth()) >= 150)
        return new inventory.item.placeableItem.PlaceableMessage("incorrecthealth");
    
    return new inventory.item.placeableItem.PlaceableMessage(true);
}