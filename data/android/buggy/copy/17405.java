public void add(com.skilltradiez.skilltraderz.Notification newNote) {
    if (lock)
        newNotifications.add(newNote);
    else
        notifications.add(newNote);
    
}