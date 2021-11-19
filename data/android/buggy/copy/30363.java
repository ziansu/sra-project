@java.lang.Override
public java.lang.String toString() {
    return org.assertj.core.util.Arrays.format("%s[format=%s, arguments=%s]", getClass().getSimpleName(), org.assertj.core.util.Strings.quote(format), org.assertj.core.util.Arrays.format(new org.assertj.core.presentation.StandardRepresentation(), arguments));
}