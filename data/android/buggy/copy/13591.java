public CtrLayer.Match generateMatch(CtrLayer.Team one, CtrLayer.Team two) {
    CtrLayer.Match match = new CtrLayer.Match();
    match.setTeam1(one);
    match.setTeam2(two);
    match.setStatus(Tournament.Status.waiting);
    return match;
}