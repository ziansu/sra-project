@java.lang.Override
public org.hni.user.om.Client getByUserId(java.lang.Long id) {
    org.hni.user.om.Client client = clientDAO.getByUserId(id);
    client.getUser().setMobilePhone(org.hni.admin.service.converter.HNIConverter.convertPhoneNumberToUiFormat(client.getUser().getMobilePhone()));
    return client;
}