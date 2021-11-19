private boolean isMotionDetected(int pastFrames) {
    synchronized(this) {
        double dm = mi.getMotion(pastFrames);
        return dm > (areaTreshold);
    }
}