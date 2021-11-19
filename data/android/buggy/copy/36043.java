@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.e("aman", "saving scores");
    if (!(intentional_end))
        endQuiz();
    else
        intentional_end = false;
    
}