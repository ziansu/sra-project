public static void destroyInstance() {
    com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance.destroy();
    com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance = null;
}