private void saveUserPreferences() {
    user.setPreferences(preferences);
    com.hexabinome.saladetomateoignon.PrefUtils.sauvegardeUtilisateur(getActivity(), user);
}