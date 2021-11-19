@java.lang.Override
public boolean isReached() {
    org.apache.commons.lang3.Validate.isTrue(this.initialised);
    return ((java.lang.System.currentTimeMillis()) - (this.startingTime)) < (this.timeout);
}