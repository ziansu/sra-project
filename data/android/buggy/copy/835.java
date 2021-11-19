@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void activityAddedToDatabase() {
    wad.domain.Activity activity = this.createWhileJoining();
    java.lang.String activityName = activity.getName();
    wad.domain.Activity activityFromRepo = activityRepository.findByName(activityName);
    assertEquals(activity, activityFromRepo);
}