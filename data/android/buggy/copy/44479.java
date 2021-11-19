private static java.lang.String getApiExceptionMessage(int code) {
    java.lang.String message = "";
    switch (code) {
        case com.joker.fourfun.net.ApiException.MESSAGE_NOT_FOUND :
            message = "好像出现了一点问题哦";
            break;
        default :
            message = "未知错误";
    }
    return message;
}