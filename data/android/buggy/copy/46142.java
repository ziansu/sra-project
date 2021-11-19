@java.lang.Override
public void onClick(android.view.View v) {
    if (changedInstitute) {
        ma.getGroupList();
        ma.sortGroups(ma.groups, ma.institute, java.lang.String.valueOf(ma.instituteID));
        changedInstitute = false;
    }
    showGroupChooseDialog();
}