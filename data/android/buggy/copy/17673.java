public java.util.Collection<io.vntr.jabeja.JabejaUser> getRandomSamplingOfUsers(int n) {
    return getUsers(io.vntr.utils.ProbabilityUtils.getKDistinctValuesFromList(n, uMap.keySet()));
}