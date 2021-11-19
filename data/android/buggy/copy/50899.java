public static edu.nr.robotics.subsystems.shooter.Shooter getInstance() {
    edu.nr.robotics.subsystems.shooter.Shooter.init();
    return edu.nr.robotics.subsystems.shooter.Shooter.singleton;
}