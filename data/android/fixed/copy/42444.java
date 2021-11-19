public static com.Ryan.Calculator.Complex divide(com.Ryan.Calculator.Complex lhs, com.Ryan.Calculator.Complex rhs) {
    com.Ryan.Calculator.Complex out = new com.Ryan.Calculator.Complex(lhs, com.Ryan.Calculator.Complex.default_epsilon);
    return out.divideTo(rhs);
}