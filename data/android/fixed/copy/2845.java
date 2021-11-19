public static cn.junety.alarm.sender.client.impl.MailClient buildMailClient(java.lang.String name) {
    return new cn.junety.alarm.sender.client.impl.MailClient(name, ConfigKey.MAIL_QUEUE.value());
}