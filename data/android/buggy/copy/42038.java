@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.String getVerboseMessageHistory() {
    return getMessageString(getMessageSet(this.warnings, this.messages, this.verboseMessages, this.exceptions));
}