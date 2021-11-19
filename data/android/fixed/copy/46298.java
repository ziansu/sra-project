@java.lang.Override
public boolean shouldShow(android.content.SharedPreferences p) {
    return (manager.getUnansweredQuestions().getCount()) >= 1;
}