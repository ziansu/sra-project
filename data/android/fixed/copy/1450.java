@org.junit.Test
public void testCreateSuccess() throws java.io.IOException {
    yukihane.dq10don.communication.dto.CharaSelectDto res = mapper.readValue(yukihane.dq10don.communication.dto.CharaSelectDtoTest.successFile, yukihane.dq10don.communication.dto.CharaSelectDto.class);
    assertEquals(0, res.getResultCode().intValue());
    assertEquals("hogeHoge", res.getEncWebPcNo());
}