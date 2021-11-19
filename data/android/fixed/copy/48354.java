public void ProfileSetup(android.view.View view) {
    if (checkUser(this)) {
        android.content.Intent intent = new android.content.Intent(this, itsjustaaron.food.ProfileSetup.class);
        startActivity(intent);
    }
}