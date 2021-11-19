com.traintrax.navigation.database.library.FilteredSearchRepositoryInterface<com.traintrax.navigation.database.library.RfidTagDetectedNotification, com.traintrax.navigation.database.library.RfidTagDetectedNotificationSearchCriteria> createRepository() {
    com.traintrax.navigation.database.library.MySqlDatabaseAdapter mySqlDatabaseAdapter = new com.traintrax.navigation.database.library.MySqlDatabaseAdapter();
    mySqlDatabaseAdapter.connect();
    com.traintrax.navigation.database.library.RfidTagDetectedNotificationRepository RfidTagDetectedNotificationRepository = new com.traintrax.navigation.database.library.RfidTagDetectedNotificationRepository();
    return RfidTagDetectedNotificationRepository;
}