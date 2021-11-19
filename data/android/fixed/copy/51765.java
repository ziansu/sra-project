public void send() {
    if (((org.usfirst.frc.team2706.robot.subsystems.Bling.previousCommand) != (org.usfirst.frc.team2706.robot.subsystems.Bling.command)) && (org.usfirst.frc.team2706.robot.subsystems.Bling.connected)) {
        org.usfirst.frc.team2706.robot.subsystems.Bling.blingPort.writeString(("I" + (org.usfirst.frc.team2706.robot.subsystems.Bling.command)));
    }
    java.lang.System.out.println(org.usfirst.frc.team2706.robot.subsystems.Bling.command);
    org.usfirst.frc.team2706.robot.subsystems.Bling.previousCommand = org.usfirst.frc.team2706.robot.subsystems.Bling.command;
}