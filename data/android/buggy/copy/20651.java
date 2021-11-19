public static boolean isPersonFromSlum(final org.matsim.api.core.v01.population.Person person) {
    return person.getId().toString().split("_")[1].equals("slum");
}