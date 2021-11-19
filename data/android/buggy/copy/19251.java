@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.home_page_searchcompany_button :
            switchToSearchCompany();
            break;
        case R.id.home_page_company_profile_button :
            switchToCompanyProfile();
            break;
    }
}