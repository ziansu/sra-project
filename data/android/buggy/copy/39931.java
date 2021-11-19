@org.junit.Test
public void testOnTeamSelected() {
    configureSubmitter();
    submitter.onTeamSelected("selected team name");
    verify(mockView).clearContributors();
    verify(mockView).setTeamInEligibleErrorVisible(eq(false), anyString());
}