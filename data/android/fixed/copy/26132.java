@java.lang.Override
public org.Clumsy.vo.CaseVO constructCase(org.springframework.web.multipart.MultipartFile caseFile) {
    org.Clumsy.entity.Case thisCase = initialize(caseFile);
    java.lang.String caseNumber = thisCase.getCaseNumber();
    return getCaseInfoByCaseNumber(caseNumber);
}