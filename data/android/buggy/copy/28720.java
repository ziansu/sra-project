public void setTime() {
    (tick)++;
    duration = (java.lang.System.nanoTime()) - (last);
    seconds += (duration) / 1.0E9F;
    last = java.lang.System.nanoTime();
}