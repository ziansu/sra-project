public synchronized void init(javax.servlet.ServletContext context) {
    if ((velocityEngine) == null) {
        velocityEngine = newVelocityEngine(context);
    }
    this.initToolbox(context);
}