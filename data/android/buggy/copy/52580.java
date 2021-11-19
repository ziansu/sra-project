@org.junit.BeforeClass
public static void before() throws java.lang.Exception {
    HealthServiceTest.healthService = new HealthService(HealthServiceTest.WATER_DAY_NORM, HealthServiceTest.CALORIES_DAY_NORM, HealthServiceTest.WALKING_MINUTES_DAY_NORM);
}