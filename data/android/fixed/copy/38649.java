public void startTask() {
    task = new com.example.cyanhearth.wordfinder.LoadDictionaryFragment.LoadDictionaryTask();
    task.execute(currentDict);
}