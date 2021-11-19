private static java.lang.String accession(java.lang.String accno) {
    return accno.matches("[\\w\\-]+") ? "COPY_" + accno : uk.ac.ebi.biostudy.submission.rest.data.Submission.generateAccession();
}