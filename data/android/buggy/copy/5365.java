public java.lang.String useItem(java.lang.String itemName) {
    int heal = player.getBackpack().usePotion(itemName, player);
    if ((-1) != heal) {
        return "Wow this shit is good";
    }
    return "You aint got that in your backpack bro";
}