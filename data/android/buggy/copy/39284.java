public double getSteeringAngle(hu.oe.nik.szfmv17t.environment.utils.Position carPosition) {
    return this.steeringControl.calculateAngle(carPosition, this.getVelocity(), this.wheelState);
}