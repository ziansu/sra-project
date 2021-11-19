@java.lang.Override
public void onAnimationRepeat(android.animation.Animator animator) {
    if (repeated) {
        current_instance.setText(com.example.cesarsk.say_it.Utility.getRandomWord(((android.app.Activity) (current_instance.getContext()))));
    }
    repeated = !(repeated);
}