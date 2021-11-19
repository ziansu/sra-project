public void jobDetails(android.view.View view) {
    if (!(currentJob.equals(com.example.phil.httppost.JobFeed.NO_JOBS_MSG))) {
        android.content.Intent intent = new android.content.Intent(this, com.example.phil.httppost.JobView.class);
        intent.putExtra("job", currentJob);
        startActivity(intent);
    }
}