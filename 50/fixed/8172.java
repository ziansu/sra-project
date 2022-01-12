public static boolean checkSugarInStock(Shop shop) {
    return (shop.inventory.getSugar()) >= (shop.recipe.sugar);
}