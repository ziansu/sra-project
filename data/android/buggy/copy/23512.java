public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mUserIngredients = savedInstanceState.getStringArrayList("userIngredients");
    allIngredientsSearchValues = savedInstanceState.getStringArrayList("searchValues");
    userInput.setText(savedInstanceState.getString("userInput"));
}