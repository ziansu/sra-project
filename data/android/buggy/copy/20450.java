public void toStageHint(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.sweets.rumandapp.StageHintActivity.class);
    intent.putExtra(Const.STAGE_ID_KEY, stageId);
    startActivity(intent);
    this.finish();
}