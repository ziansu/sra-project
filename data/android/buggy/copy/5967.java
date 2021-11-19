public static void bindView(org.amahi.anywhere.server.model.ServerFile file, org.amahi.anywhere.server.model.ServerFileMetadata fileMetadata, android.view.View fileView) {
    if (fileMetadata == null) {
        org.amahi.anywhere.adapter.ServerFilesMetadataAdapter.bindFileView(file, fileView);
    }else {
        org.amahi.anywhere.adapter.ServerFilesMetadataAdapter.bindFileMetadataView(file, fileMetadata, fileView);
    }
}