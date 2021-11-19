public static com.Ryan.Calculator.Complex add(com.Ryan.Calculator.Complex lhs, com.Ryan.Calculator.Complex rhs) {
    com.Ryan.Calculator.Complex out = new com.Ryan.Calculator.Complex(lhs, com.Ryan.Calculator.Complex.default_epsilon);
    out.addTo(rhs);
    return out;
}