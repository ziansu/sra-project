public void onGetStarted(android.view.View view) {
    android.content.Intent getStarted = new android.content.Intent(this, com.example.corneeldenhartogh.corneel_pset2.FillWords.class);
    getStarted.putExtra("callingFillWords", getString(R.string.instruction_filler));
    startActivity(getStarted);
}