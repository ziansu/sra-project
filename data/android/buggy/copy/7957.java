public static double CrossValidateKFold(int testType, java.util.List<Mail> mails, int folds) throws java.lang.Exception {
    java.lang.System.out.println("===Cross Validate K-Fold===");
    java.lang.System.out.println("===Cross Validate K-Fold===");
    java.util.Collections.shuffle(mails);
    return ModelValidations.KFoldTest(testType, mails, folds);
}