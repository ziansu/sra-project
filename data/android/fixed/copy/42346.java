@java.lang.Override
public void onSuccess(com.example.magda.systeminformacyjny.network.DefaultIdWrapper value) {
    comments.remove(null);
    comments.add(new com.example.magda.systeminformacyjny.models.Comment(value.getId(), content, score));
    successResponses.add(new com.example.magda.systeminformacyjny.network.SuccessResponse(com.example.magda.systeminformacyjny.network.SuccessResponse.SEND_OPINION_SUCCESS));
    onSuccessResponse();
}