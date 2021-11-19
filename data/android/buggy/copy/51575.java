public void deleteFood() {
    int rowsDeleted = databaseAdapter.deleteFood(foodId);
    if (rowsDeleted == 1) {
        android.widget.Toast.makeText(getActivity(), "Food deleted", Toast.LENGTH_SHORT).show();
        onFoodSaved.onFoodSavedSuccessfully();
    }
}