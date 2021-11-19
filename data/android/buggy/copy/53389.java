@retrofit2.http.Multipart
@retrofit2.http.POST(value = "/contacts.json")
io.reactivex.Observable<com.ryandzhunter.contact.data.model.Contact> addContactWithImage(@retrofit2.http.Part
okhttp3.MultipartBody.Part image, @retrofit2.http.Part(value = "first_name")
okhttp3.RequestBody firstName, @retrofit2.http.Part(value = "last_name")
okhttp3.RequestBody lastName, @retrofit2.http.Part(value = "email")
okhttp3.RequestBody email, @retrofit2.http.Part(value = "phone_number")
okhttp3.RequestBody phoneNumber);