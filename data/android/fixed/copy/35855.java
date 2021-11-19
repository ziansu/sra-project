public io.reactivex.Flowable<com.ryandzhunter.contact.data.model.Contact> addContactWithImage(okhttp3.MultipartBody.Part image, okhttp3.RequestBody firstName, okhttp3.RequestBody lastName, okhttp3.RequestBody email, okhttp3.RequestBody phoneNumber) {
    return service.addContactWithImage(image, firstName, lastName, email, phoneNumber).toFlowable(BackpressureStrategy.BUFFER);
}