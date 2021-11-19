@org.junit.Test
public void testNoColumns() {
    org.activityinfo.model.query.QueryModel queryModel = new org.activityinfo.model.query.QueryModel(org.activityinfo.model.legacy.CuidAdapter.activityFormClass(1));
    query(queryModel);
    assertThat(columnSet.getNumRows(), equalTo(3));
}