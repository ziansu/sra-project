private static java.lang.String accession(java.lang.String accno) {
    return accno.matches("[\\w\\-]+") ? accno : uk.ac.ebi.biostudy.submission.rest.data.Submission.generateAccession();
}