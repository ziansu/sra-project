public static com.seyren.core.service.notification.VictorOpsNotificationService.MessageType fromAlertType(com.seyren.core.service.notification.AlertType alert) {
    switch (alert) {
        case OK :
            return com.seyren.core.service.notification.VictorOpsNotificationService.MessageType.RECOVERY;
        case WARN :
        case UNKNOWN :
            return com.seyren.core.service.notification.VictorOpsNotificationService.MessageType.WARNING;
        case ERROR :
        case EXCEPTION :
            return com.seyren.core.service.notification.VictorOpsNotificationService.MessageType.CRITICAL;
        default :
            return com.seyren.core.service.notification.VictorOpsNotificationService.MessageType.INFO;
    }
}