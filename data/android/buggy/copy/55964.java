public static void destroyDocAccessor() {
    com.pratilipi.data.DocAccessor docAccessor = com.pratilipi.data.DataAccessorFactory.threadLocalDocAccessor.get();
    if (docAccessor != null)
        com.pratilipi.data.DataAccessorFactory.threadLocalDataAccessor.remove();
    
}