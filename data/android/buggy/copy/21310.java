private void sendSchedule(edu.gatech.ledpathways.androidemployeeapp.objects.Schedule schedule, android.app.ProgressDialog p, android.widget.TextView v) {
    edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes post = new edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes(schedule, v, p, this);
    post.execute();
}