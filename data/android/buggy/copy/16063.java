private void execute() {
    asyncTask.cancel(true);
    asyncTask = new com.teinproductions.tein.smartcalc.maths.FactorizationActivity.FactorizationAsyncTask();
    asyncTask.execute();
}