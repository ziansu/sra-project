@java.lang.Override
public boolean isTimeout() {
    return ((java.lang.System.currentTimeMillis()) - (lastAccessTime)) > (net.algart.pyramid.standard.StandardPlanePyramid.PYRAMID_TIMEOUT);
}