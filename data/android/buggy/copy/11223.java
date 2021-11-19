protected void checkDocString(@org.jetbrains.annotations.NotNull
com.jetbrains.python.inspections.PyDocStringOwner node) {
    for (com.jetbrains.python.inspections.PyInspectionExtension extension : com.intellij.openapi.extensions.Extensions.getExtensions(PyInspectionExtension.EP_NAME)) {
        if (extension.ignoreMissingDocstring(node)) {
            return ;
        }
    }
}