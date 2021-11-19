@java.lang.Override
public void onClick(android.view.View v) {
    (com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter)--;
    com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter = ((com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter) < 0) ? com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.questArr.length : com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter;
    refreshQuest();
}