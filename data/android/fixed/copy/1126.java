public static void showResults(double bmi) {
    if (bmi > 25) {
        java.lang.System.out.println("You are Overweight");
    }else
        if (bmi >= 18.5) {
            java.lang.System.out.println("You are Normal weight");
        }else {
            java.lang.System.out.println("You are under weight");
        }
    
}