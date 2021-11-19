@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public float calculate(float operandOne, float operandTwo, java.lang.String operator) {
    return operationService.doOperation(operandOne, operandTwo, operator);
}