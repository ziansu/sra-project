@java.lang.Override
public void uploadSucceeded(final com.vaadin.ui.Upload.SucceededEvent event) {
    executor.execute(new org.eclipse.hawkbit.ui.management.targettable.BulkUploadHandler.UploadAsync());
}