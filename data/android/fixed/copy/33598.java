@java.lang.Override
public void navigateToStepsActivity(dk.jbfp.staveapp.User user) {
    android.content.Intent intent = new android.content.Intent(this, dk.jbfp.staveapp.steps.StepsActivity.class);
    intent.putExtra(StepsActivity.USER_KEY, user);
    startActivity(intent);
}