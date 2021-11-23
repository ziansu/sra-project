@java.lang.Override
public boolean isModified() {
    return !(myBackgroundChibiApplicationSeetings.getSettings().equals(getForm().getSettings()));
}