@java.lang.Override
public no.difi.meldingsutveksling.noarkexchange.schema.PutMessageResponseType send(no.difi.meldingsutveksling.core.EDUCore request) {
    svarUtService.send(request);
    return no.difi.meldingsutveksling.noarkexchange.PutMessageResponseFactory.createOkResponse();
}