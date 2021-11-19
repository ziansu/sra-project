@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/info")
public org.cloudfoundry.samples.music.domain.ApplicationInfo info() {
    try {
        java.lang.System.out.println("BIG TIME PERFORMANCE PROBLEM (info)");
        java.lang.Thread.sleep(4000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return new org.cloudfoundry.samples.music.domain.ApplicationInfo(springEnvironment.getActiveProfiles(), getServiceNames());
}