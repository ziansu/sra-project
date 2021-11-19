@java.lang.Override
public void onCreate() {
    super.onCreate();
    searchEventsFlow = new evenz.shai.com.evenz.business_layer.SearchEventsFlow(eventsDataSource, filtersConfiguration, geoInfoProvider);
}