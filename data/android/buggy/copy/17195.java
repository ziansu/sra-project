@java.lang.Override
public void run() {
    new com.tobyrich.dev.hangarapp.activities.AchievementsActivity.AchievementsFeeder(getApplicationContext()).execute();
    java.lang.System.out.println(("Load new = " + (java.lang.System.currentTimeMillis())));
}