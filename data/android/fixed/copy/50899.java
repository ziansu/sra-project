public static edu.nr.robotics.subsystems.shooter.Shooter getInstance() {
    if ((edu.nr.robotics.subsystems.shooter.Shooter.singleton) == null)
        edu.nr.robotics.subsystems.shooter.Shooter.init();
    
    return edu.nr.robotics.subsystems.shooter.Shooter.singleton;
}