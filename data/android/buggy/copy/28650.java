private void validateAlgo(java.lang.String algo, org.springframework.validation.Errors errors) {
    if (!((algo.equals("HSV")) || (algo.equals("Rgb")))) {
        errors.rejectValue("algo", "NOT_A_VALID_ALGO", "La valeur de l'algorithm est invalide");
    }
}