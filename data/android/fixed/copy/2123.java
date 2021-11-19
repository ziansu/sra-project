public void startFragment(android.app.Fragment fragment) {
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.create_workout_fragment_container, fragment);
    fragmentTransaction.commit();
}