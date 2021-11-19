public static void destroyInstance() {
    if ((com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance) != null) {
        com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance.destroy();
        com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance = null;
    }
}