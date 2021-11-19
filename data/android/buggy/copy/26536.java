public void storeQuiz() {
    com.team8.utest.InternalStorage.writeQuiz(this, quiz);
    db.execute(quiz);
}