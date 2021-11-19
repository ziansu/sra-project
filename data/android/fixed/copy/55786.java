@org.junit.Test
public void testGetNetmaskShortFormTooShortSubnet() {
    try {
        org.eclipse.kura.core.net.util.NetworkUtil.getNetmaskShortForm("255.255.255");
        org.junit.Assert.fail("too short subnet");
    } catch (org.eclipse.kura.KuraException e) {
    }
}