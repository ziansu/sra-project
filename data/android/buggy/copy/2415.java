@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.String getMessageHistory() {
    return getMessageString(getMessageSet(this.warnings, this.messages, this.exceptions));
}