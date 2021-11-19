public void createNew() {
    interview = new de.udk.drl.mazirecorderandroid.models.InterviewModel();
    observable.onNext(interview);
}