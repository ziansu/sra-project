private boolean checkPlayServicesAndRegister() {
    if (de.tum.in.tumcampus.services.GcmIdentificationService.checkPlayServices(this)) {
        de.tum.in.tumcampus.services.GcmIdentificationService idService = new de.tum.in.tumcampus.services.GcmIdentificationService();
        idService.checkSetup();
        return true;
    }else {
        de.tum.in.tumcampus.auxiliary.Utils.log("No valid Google Play Services APK found.");
        return false;
    }
}