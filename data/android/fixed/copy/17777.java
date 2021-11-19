@java.lang.Override
public void onClick(android.view.View view) {
    if ((SightingModel.model.getSightings().size()) <= 1) {
        (alreadyRead)++;
        launchActivity2();
    }else {
        launchActivity3();
    }
}