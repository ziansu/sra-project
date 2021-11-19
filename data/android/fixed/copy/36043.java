@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (!(intentional_end))
        endQuiz();
    else
        intentional_end = false;
    
}