public void GoToSessionTwo(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, jp.ac.tsukuba.cs.iplab.www.barotouchexperimentalapplications.SessionTwoActivity.class);
    intent.putExtra("Calibration", calibration);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}