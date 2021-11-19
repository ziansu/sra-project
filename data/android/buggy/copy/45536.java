@org.junit.BeforeClass
public static void setUpClass() {
    for (edu.chl.LifeOfAGoblin.model.profile.Profile profile : edu.chl.LifeOfAGoblin.model.profile.Profile.getProfiles()) {
        edu.chl.LifeOfAGoblin.model.profile.Profile.removeProfile(profile);
    }
}