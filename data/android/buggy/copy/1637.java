public void onClickEditProgramButton(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, lu.uni.trailassistant.activities.EditTrainingProgramExercisesActivity.class);
    long trainingProgramRowID = tpca.getItemId(lastSelectedIndex);
    intent.putExtra("training_program_id", tpca.getItemId(lastSelectedIndex));
    startActivity(intent);
}