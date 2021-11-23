private double pvCalcBoundTimeChild() {
    double time = (pvStartTime) + ((java.lang.Math.random()) * ((pvEndTime) - (pvStartTime)));
    return time;
}