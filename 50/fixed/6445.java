@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    com.namclu.android.bloquery.api.model.Question question = dataSnapshot.getValue(com.namclu.android.bloquery.api.model.Question.class);
    mQuestionAdapter.addQuestion(question);
}