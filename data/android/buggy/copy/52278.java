@java.lang.Override
public void onClick(android.view.View v) {
    if (checkMissingFieldError(((android.widget.EditText) (findViewById(R.id.user_entered_calories))))) {
        getGoals();
    }
}