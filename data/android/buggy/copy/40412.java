@java.lang.Override
public void onGoodInsert() {
    com.sweproject.calorietracker.MainActivity.nextFragment(this, new com.sweproject.calorietracker.FragmentDay(), getArguments(), true, true, 0);
}