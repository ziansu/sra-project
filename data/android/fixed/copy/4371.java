@org.junit.Test(expected = sg.ncl.service.registration.exceptions.RegisterTeamIdEmptyException.class)
public void approveTeamNullTeamId() throws java.lang.Exception {
    registrationService.approveTeam(null, null, TeamStatus.APPROVED);
}