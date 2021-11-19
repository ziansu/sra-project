public java.lang.String report() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("robot status:\n");
    if ((chatRobot) != null) {
        sb.append(chatRobot.report());
    }
    return sb.toString();
}