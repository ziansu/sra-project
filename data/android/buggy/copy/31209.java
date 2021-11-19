@java.lang.Override
public void failed(java.lang.Exception e) {
    logger.error("Topup failed due to: {}", e.getMessage());
    replyWechatForPayNotification(false);
}