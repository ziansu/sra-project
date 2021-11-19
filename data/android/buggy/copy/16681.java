@javax.annotation.CheckReturnValue
@javax.annotation.CheckForNull
public static java.lang.String normalizeUserName(@javax.annotation.CheckForNull
java.lang.String inputName) throws jmri.NamedBean.BadUserNameException {
    return inputName.trim();
}