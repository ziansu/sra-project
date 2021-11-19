private void setCurrentOperand(com.calculator.common.Result result) {
    m_result = result;
    if (result.hasError())
        return ;
    
    if (m_secondOperandSet)
        m_secondOperand = result.getNumber();
    
    m_firstOperand = result.getNumber();
}