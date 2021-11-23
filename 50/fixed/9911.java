@java.lang.Override
public void loggEvent(org.otheralgor.spring.Event event) {
    try {
        org.apache.commons.io.FileUtils.writeStringToFile(file, ((event.toString()) + "\n"), true);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}