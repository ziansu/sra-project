private void uploadPhoto() {
    sk.stuba.fiit.revizori.imgur.model.Upload upload = new sk.stuba.fiit.revizori.imgur.model.Upload();
    upload.image = new java.io.File(photoPath);
    new sk.stuba.fiit.revizori.imgur.UploadService(this).Execute(upload, new sk.stuba.fiit.revizori.EditSubmissionActivity.UiCallback());
}