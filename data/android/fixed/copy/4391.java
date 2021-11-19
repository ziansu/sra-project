@java.lang.Override
protected com.vn.dailycookapp.entity.response.DCAResponse execute() throws java.lang.Exception {
    com.vn.dailycookapp.entity.response.DCAResponse response = new com.vn.dailycookapp.entity.response.DCAResponse(ErrorCodeConstant.SUCCESSUL.getErrorCode());
    com.vn.dailycookapp.security.session.SessionManager.getInstance().closeSessionOfToken(token);
    org.dao.DeviceTokenDAO.getInstance().removeUserDevices(myId);
    return response;
}