public void set(double time, us.ihmc.robotics.geometry.FramePoint position, us.ihmc.robotics.geometry.FrameVector linearVelocity) {
    setTime(time);
    this.position.set(position);
    this.linearVelocity.set(linearVelocity);
}