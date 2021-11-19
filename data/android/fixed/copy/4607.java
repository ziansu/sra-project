private boolean isNotTransitAgent(org.matsim.api.core.v01.Id<org.matsim.api.core.v01.population.Person> persondId) {
    return (java.lang.Integer.parseInt(persondId.toString())) < 1000000000;
}