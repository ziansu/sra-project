@org.junit.Test
public void digestBySHA512() {
    core.framework.api.crypto.HMAC hmac = new core.framework.api.crypto.HMAC("4VPDEtyUE".getBytes(), HMAC.Hash.SHA512);
    byte[] bytes = hmac.digest(core.framework.api.util.Strings.bytes("hello"));
    org.junit.Assert.assertNotNull(bytes);
}