@org.junit.Test(expected = sg.ncl.service.team.exceptions.NoOwnerInTeamException.class)
public void approveTeamNoOwner() throws java.lang.Exception {
    sg.ncl.service.team.domain.Team one = sg.ncl.service.registration.Util.getTeamEntity();
    sg.ncl.service.team.domain.Team createdTeam = teamService.createTeam(one);
    registrationService.approveTeam(createdTeam.getId(), null, TeamStatus.APPROVED);
}