@java.lang.Override
public void onCategoryIncomeClick(com.zhan.budget.Model.Category category) {
    android.widget.Toast.makeText(getApplicationContext(), ("clicked on income category : " + (category.getName())), Toast.LENGTH_SHORT).show();
    selectedIncomeCategory = category;
}