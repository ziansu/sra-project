@java.lang.Override
protected void onPostExecute(java.lang.Integer integer) {
    super.onPostExecute(integer);
    setUpCurrentSequence();
    if ((gameMode) != 2) {
    }
    cancelPlayer();
    isSimonsTurn = true;
    playSimonSequence();
}