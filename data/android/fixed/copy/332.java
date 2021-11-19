public edu.purdue.cs490.VectorClock incrementVectorClock(java.lang.String sender) {
    this.set(sender, ((this.getTime(sender)) + 1));
    return null;
}