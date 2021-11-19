@android.support.annotation.NonNull
public rx.Observable<com.github.st1hy.countthemcalories.database.IngredientTemplate> saveIntoDatabase() {
    return insertOrUpdateIntoDatabase();
}