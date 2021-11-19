private void execute() {
    asyncTask.cancel(true);
    asyncTask = new com.teinproductions.tein.smartcalc.maths.GCFActivity.GCFCreator(this);
    asyncTask.execute(num1, num2);
}