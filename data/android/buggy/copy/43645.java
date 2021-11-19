@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    java.util.UUID apartmentId = ((java.util.UUID) (getIntent().getSerializableExtra(com.example.alex.roomloo_v2.ApartmentActivity.EXTRA_APARTMENT_ID)));
    com.example.alex.roomloo_v2.ApartmentActivity.fragmentManager = getSupportFragmentManager();
    return com.example.alex.roomloo_v2.ApartmentFragment.newInstance(apartmentId);
}