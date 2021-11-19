@java.lang.Override
public void onNext(ru.nbakaev.cityguide.poi.Poi value) {
    if (value != null)
        processMoveToIntentPoi(value);
    
}