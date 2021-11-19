public void tellJoke(android.view.View view) {
    progressBar.setVisibility(View.VISIBLE);
    jokesAsyncTask = new com.udacity.gradle.builditbigger.tasks.JokesAsyncTask(this);
    jokesAsyncTask.execute();
    if ((fragment) != null) {
        fragment.onCallFragment();
    }
}