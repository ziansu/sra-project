@java.lang.Override
public void handleEvent(com.extjs.gxt.ui.client.event.BaseEvent be) {
    exercise.setWeights(tfWeights.getValue());
    handler.saveData(exercise, false);
}