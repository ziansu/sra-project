@java.lang.Override
public boolean apply(org.apache.beam.sdk.util.ApiSurface.ClassPath.ClassInfo info) {
    return (info != null) && ((info.className.indexOf('$')) == (-1));
}