public static void initialize(android.content.Context context, nuclei3.notifications.NotificationManager instance) {
    nuclei3.notifications.NotificationManager.CONTEXT = context.getApplicationContext();
    nuclei3.notifications.NotificationManager.INSTANCE = instance;
    nuclei3.notifications.NotificationManager.DB = android.arch.persistence.room.Room.databaseBuilder(nuclei3.notifications.NotificationManager.CONTEXT, nuclei3.notifications.model.NotificationsDb.class, "nuclei_notifications.db").fallbackToDestructiveMigration().build();
}