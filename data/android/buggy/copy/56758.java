public static void readAnswers() {
    io.realm.RealmResults<io.mdevlab.ocatraining.model.Answer> answers = io.mdevlab.ocatraining.modelManager.AnswerManager.getAllAnswers();
    for (io.mdevlab.ocatraining.model.Answer answer : answers)
        android.util.Log.e(io.mdevlab.ocatraining.test.AnswerTest.TAG, answer.toString());
    
}