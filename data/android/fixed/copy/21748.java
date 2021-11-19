@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mOrganisationUnitProgramPickerPresenter = new org.hisp.dhis.android.eventcapture.fragments.picker.OrganisationUnitProgramPickerPresenter(this);
    mOrganisationUnitProgramPickerPresenter.setOrganisationUnitProgramPickerView(this);
    this.createPickers();
}