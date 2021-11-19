@org.springframework.web.bind.annotation.RequestMapping(value = "/send-message", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public com.uzh.csg.overlaynetworks.domain.dto.MessageResult sendMessage(@org.springframework.web.bind.annotation.RequestBody
com.uzh.csg.overlaynetworks.domain.dto.Message message) {
    com.uzh.csg.overlaynetworks.domain.dto.MessageResult result = new com.uzh.csg.overlaynetworks.domain.dto.MessageResult();
    if (dataHolder.isAuthenticated()) {
        p2pService.sendMessage(message);
    }else {
        throw new com.uzh.csg.overlaynetworks.web.exception.InvalidDataProvidedException();
    }
    return result;
}