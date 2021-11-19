@org.jvnet.hudson.test.Issue(value = "JENKINS-40657")
@org.junit.Test
public void libraryObjectDefinedOutsidePipeline() throws java.lang.Exception {
    expect("libraryObjectDefinedOutsidePipeline").logContains("hello");
}