@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testGetFutureMeeting_PastID() {
    int pastID = standardCMP.getAllPastMeetings().get(0).getId();
    standardCMP.getFutureMeeting(pastID);
}