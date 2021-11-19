@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.util.Log.i(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, "onRestart event fired.");
    android.util.Log.e(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, ((topicIndex) + ""));
}