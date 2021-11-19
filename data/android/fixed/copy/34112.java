public void addSport(es.upm.miw.apaw.user.api.entities.Sport sport) {
    assert sport != null;
    sports.put(sport.getId(), sport);
}