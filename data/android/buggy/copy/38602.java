@java.lang.Override
public void updateView(@android.support.annotation.NonNull
ahsan.io.farmleaddemo.model.Offer_ offer) {
    offer.getGrainDetailsJson();
    mGrainsView.updateView(offer.getGrainDetailsJson());
}