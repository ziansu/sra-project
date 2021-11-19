public Calculator.Function Copy() throws java.lang.Exception {
    Calculator.Function function = new Calculator.Function(rawText, getCalculator());
    function.current_paramters = this.current_paramters;
    return function;
}