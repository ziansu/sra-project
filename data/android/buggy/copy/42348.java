@java.lang.Override
public void SuccessResponse(org.json.JSONObject response, int requestCode) {
    com.app.lifeshare.Utils.CommonUtils.hideLoadingDialog();
    switch (requestCode) {
        case com.app.lifeshare.Utils.APIURL.REQ_GET_CHAT_MESSAGES :
        case com.app.lifeshare.Utils.APIURL.REQ_SEND_CHAT_MESSAGE :
            parseUserChaMessagetResponse(response);
            break;
    }
}