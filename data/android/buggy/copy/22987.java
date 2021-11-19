@java.lang.Override
public jcl.numbers.NumberStruct negation() {
    return new jcl.numbers.ComplexStruct(((jcl.numbers.RealStruct) (real.negation())), imaginary);
}