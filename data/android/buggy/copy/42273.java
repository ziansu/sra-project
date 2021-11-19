@com.fasterxml.jackson.annotation.JsonIgnore
public int getDurationFinish() {
    java.lang.Integer duration = getAttribute(com.github.ddth.djs.bo.log.TaskLogBo.ATTR_DURATION_FINISH, java.lang.Integer.class);
    return duration != null ? duration.intValue() : 0;
}