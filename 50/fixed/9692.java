public void doTrainning(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "Going to Train Yourself activity", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(this, team_uganda.ieltsassistor.TrainYourself.class);
    startActivity(intent);
}