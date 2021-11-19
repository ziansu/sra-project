public void showResultButtonClicked(android.view.View view) {
    java.util.ArrayList<com.example.etasheva.kinveytest.models.LaptopSqlite> result = this.mLoadDataService.showResult();
    android.content.Intent intent = new android.content.Intent(this, com.example.etasheva.kinveytest.activities.SecondActivity.class);
    intent.putExtra("result", result);
    startActivity(intent);
}