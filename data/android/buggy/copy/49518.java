@java.lang.Override
public boolean condition() {
    return com.google.common.base.Strings.isNullOrEmpty(module.getName()) ? false : true;
}