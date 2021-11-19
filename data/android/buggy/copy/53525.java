@com.loans.controller.RequestMapping(value = "/loan/editdraft", method = RequestMethod.POST)
public void editLoanDraftbyUID(@com.loans.controller.RequestParam(value = "uniqueLoanId")
java.lang.String uid, @com.loans.controller.RequestBody
com.loans.bean.request.LoanRequest loanRequest) {
    com.loans.bean.entity.Loan loan = loanRepository.findByuniqueLoanId(uid);
    loanService.editDraft(loan, loanRequest);
}