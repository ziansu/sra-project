@java.lang.Override
public void onBackPressed() {
    ((com.themealz.themealz.TheMealzApplication) (this.getApplication())).removeFromMealOptionsMap(parentID);
    super.onBackPressed();
}