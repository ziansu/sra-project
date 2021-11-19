public void deOrganizeDeveloperMeeting() {
    nl.saxion.maurens.utility.SleepUtil.sleep(10000);
    for (nl.saxion.maurens.company.Person person : devMeetingUsers) {
        person.endMeeting();
    }
    devMeetingUsers.clear();
    nl.saxion.maurens.utility.LogUtil.log("dev meeting ended");
}