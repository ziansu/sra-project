@com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand(groupKey = "ExternalService", commandKey = "someCommandKey2")
public void doStuff2() {
    java.lang.System.err.println("doStuff2");
}