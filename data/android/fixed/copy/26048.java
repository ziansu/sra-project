@java.lang.Override
public void setDefaultValue(java.lang.String value) {
    checkValidDefaultValue(getName(), validValues, value);
    this.defaultValue = value;
}