void clearCertificateErrorNotifications(com.fsck.k9.activity.setup.CheckDirection direction) {
    final com.fsck.k9.controller.MessagingController ctrl = com.fsck.k9.controller.MessagingController.getInstance(context);
    ctrl.clearCertificateErrorNotifications(account, direction);
}