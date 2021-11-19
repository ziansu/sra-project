@java.lang.Override
public void run() throws java.lang.Exception {
    misc.Log.log(("Acq event slice index " + (event.sliceIndex_)));
    misc.Log.log(("Acq event z position " + (event.zPosition_)));
    acq.MagellanEngine.core_.setPosition(zStage, event.zPosition_);
}