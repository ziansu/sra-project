protected void interrupted() {
    java.lang.System.out.println("Interrupting autonomous mode (did teleop mode start?).");
    this.end();
}