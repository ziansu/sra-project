private static void load() {
    if (!(model.DataManager.prefs.get().isEmpty())) {
        model.DataManager.teachers = new com.badlogic.gdx.utils.Json().fromJson(java.util.ArrayList.class, model.DataManager.prefs.getString("teachers"));
    }
}