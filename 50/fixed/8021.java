@org.junit.Before
public void setUp() {
    p = new edu.chl.LifeOfAGoblin.model.profile.Profile("Test");
    mockP = org.mockito.Mockito.mock(edu.chl.LifeOfAGoblin.model.profile.Profile.class);
}