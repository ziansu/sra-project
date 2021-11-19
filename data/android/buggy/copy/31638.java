public void setMAX_ENCODER_VEL(double mAX_ENCODER_VEL_RIGHT, double mAX_ENCODER_VEL_LEFT) {
    MAX_ENCODER_VEL_RIGHT = mAX_ENCODER_VEL_RIGHT;
    MAX_ENCODER_VEL_LEFT = mAX_ENCODER_VEL_LEFT;
    encoderChanges = new java.util.LinkedList<org.team3309.lib.controllers.drive.VelocityChangePoint>();
    encoderChanges.add(new org.team3309.lib.controllers.drive.VelocityChangePoint(MAX_ENCODER_VEL_RIGHT, 0));
}