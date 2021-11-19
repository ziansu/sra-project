public void removeItemFromStorage(com.jadventure.game.items.Item item) {
    if (!(item.equals(itemRepo.getItem("empty")))) {
        storage.removeItem(new com.jadventure.game.items.ItemStack(1, item));
    }
}