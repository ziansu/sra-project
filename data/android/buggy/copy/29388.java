@java.lang.Override
public no.difi.meldingsutveksling.noarkexchange.schema.PutMessageResponseType send(no.difi.meldingsutveksling.core.EDUCore request) {
    final java.lang.String send = svarUtService.send(request);
    return no.difi.meldingsutveksling.noarkexchange.PutMessageResponseFactory.createOkResponse();
}