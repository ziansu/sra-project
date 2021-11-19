public void addDropRequest(Request req) throws java.lang.Exception {
    if ((req.toDropOff) != null) {
        req.toDropOff.addFloor(req);
    }else {
        throw new java.lang.Exception("pickup request given to dropoff add method");
    }
}