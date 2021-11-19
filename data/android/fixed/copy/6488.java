@org.jetbrains.annotations.Nullable
@java.lang.Override
public nl.runnable.spring.fileupload.StoredMultipartFile find(@org.jetbrains.annotations.NotNull
java.lang.String id) {
    org.springframework.util.Assert.hasText(id, "ID cannot be empty.");
    nl.runnable.spring.fileupload.StoredMultipartFile file = storage.find(id);
    if (isBoundToSession(file)) {
        return file;
    }else {
        return null;
    }
}