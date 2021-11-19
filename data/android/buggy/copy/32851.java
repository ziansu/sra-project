@java.lang.Override
public com.castlemock.core.mock.soap.model.project.dto.SoapPortDto updateSoapPort(final java.lang.String soapProjectId, final java.lang.String soapPortId, final com.castlemock.core.mock.soap.model.project.dto.SoapPortDto soapPortDto) {
    final com.castlemock.web.mock.soap.model.project.repository.SoapPort soapPort = findSoapPortType(soapProjectId, soapPortId);
    soapPort.setUri(soapPortDto.getUri());
    return null;
}