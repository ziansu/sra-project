@java.lang.Override
public boolean belongsToRoster() {
    return ((getSurvey()) != null) && (getSurvey().belongsToRoster());
}