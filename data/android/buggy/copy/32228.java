@org.junit.Test
public void testValidateEPUBPFileDeclaredInContainerNotOpf20() {
    java.util.Collections.addAll(expectedErrors, MessageId.RSC_005);
    testValidateDocument("ContainerNotOPF20.epub");
}