@java.lang.Override
public void completed(com.platypus.crw.data.UtmPose[] wps) {
    for (com.platypus.crw.data.UtmPose i : wps) {
        java.lang.System.out.println("wp");
        java.lang.System.out.println(i.toString());
    }
}