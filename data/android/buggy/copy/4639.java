protected static void eventBrakeChanged(int brake) {
    group8.com.application.Application.Session.setBrake(brake);
    group8.com.application.Application.GradingSystem.updateBrakeScore(brake);
}