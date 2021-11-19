@com.softserve.edu.documents.document.meta.Placeholder(name = "VERIFICATOR")
public java.lang.String getVerificator() {
    com.softserve.edu.entity.Organization verificator = getVerification().getStateVerificator();
    if (verificator != null) {
        verificator.getName();
    }
    return "None";
}