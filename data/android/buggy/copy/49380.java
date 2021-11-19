@org.junit.Before
public void setup() {
    pose = injector.getInstance(xbot.common.subsystems.pose.TestPoseSubsystem.class);
}