public void onClick_btnStartChallenge(android.view.View view) {
    mBattleshipBoardManager.saveGameBoard();
    android.content.Intent intent = new android.content.Intent(this, com.cognitutor.cognistudyapp.Activities.ChallengeActivity.class);
    startActivity(intent);
    finish();
}