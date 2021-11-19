@java.lang.Override
public boolean isTimeout() {
    return ((net.algart.pyramid.standard.StandardPlanePyramid.PYRAMID_TIMEOUT) > 0) && (((java.lang.System.currentTimeMillis()) - (lastAccessTime)) > (net.algart.pyramid.standard.StandardPlanePyramid.PYRAMID_TIMEOUT));
}