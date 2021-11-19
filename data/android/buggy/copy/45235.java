@java.lang.Override
public void exec(com.ninty.runtime.NiFrame frame) {
    com.ninty.runtime.OperandStack stack = frame.getOperandStack();
    float num1 = stack.popFloat();
    float num2 = stack.popFloat();
    stack.pushFloat((num1 % num2));
}