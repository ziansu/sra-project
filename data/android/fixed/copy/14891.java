@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    learnJava.setCurrentLevel(((learnJava.getCurrentLevel()) + 1));
    activity.startActivity(new android.content.Intent(activity, tda367.myapplication.controller.ActivityInfo.class));
}