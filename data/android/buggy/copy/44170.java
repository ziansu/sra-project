@org.junit.Test
public void testGetCategoriesOk() throws java.lang.Exception {
    response = configResourceRest.getCategories(request);
    java.util.List<org.catrobat.jira.timesheet.rest.json.JsonCategory> responseTeamList = ((java.util.List<org.catrobat.jira.timesheet.rest.json.JsonCategory>) (response.getEntity()));
    assertNotNull(responseTeamList);
}