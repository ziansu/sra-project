@retrofit.http.Multipart
@retrofit.http.POST(value = "/")
com.instructure.canvasapi.model.Attachment uploadCourseFile(@retrofit.http.PartMap
java.util.LinkedHashMap<java.lang.String, java.lang.String> params, @retrofit.http.Part(value = "file")
retrofit.mime.TypedFile file, @retrofit.http.Body
java.lang.String body);