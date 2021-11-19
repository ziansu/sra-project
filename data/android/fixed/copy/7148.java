@org.junit.Before
public void startUpdate() {
    update = new org.openmrs.module.openconceptlab.Update();
    updateService.startUpdate(update);
}