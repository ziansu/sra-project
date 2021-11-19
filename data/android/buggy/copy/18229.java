public void unregisterDurableNotifyTemplate(com.gigaspaces.internal.server.storage.NotifyTemplateHolder template) {
    synchronized(_notifyTemplatesLock) {
        if (template.containsNotifyType(NotifyActionType.NOTIFY_TAKE)) {
            (_numOfDurableNotifyTakeTemplates)--;
            _anyDurableNotifyTakeTemplates = (_numOfNotifyTakeTemplates) > 0;
        }
    }
}