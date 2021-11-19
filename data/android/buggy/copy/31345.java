public java.util.ArrayList<client.commander.ScheduleEvent> search(java.lang.String orgName) {
    java.lang.String input = java.lang.String.format("%s;%get", orgName);
    client.parseRequest(input);
}