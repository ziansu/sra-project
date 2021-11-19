public com.lukedeighton.wheelsample.AttendantData getAttendantById(java.lang.String id) {
    for (com.lukedeighton.wheelsample.AttendantData attendant : mAttendantDataList) {
        if (id.contains(attendant.mID)) {
            return attendant;
        }
    }
    return null;
}