public java.lang.String useItem(java.lang.String itemName) {
    if (player.getBackpack().usePotion(itemName, player)) {
        return "Wow this shit is good";
    }
    return "You aint got that in your backpack bro";
}