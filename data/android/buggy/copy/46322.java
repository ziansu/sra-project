public void switchToCompanyProfile() {
    android.content.Intent intent = new android.content.Intent(this, seniordesign.ratemybusinesspartners.CompanyProfile.class);
    intent.putExtra(CompanyProfile.COMPANY_PROFILE_TARGET_COMPANY, "Walmart");
    startActivity(intent);
}