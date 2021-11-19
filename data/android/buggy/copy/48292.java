public void keyReleased(java.awt.event.KeyEvent e) {
    setValue(new hypertalk.ast.common.Value(text.getText()));
    if (!(hypercard.context.GlobalContext.getContext().noMessages()))
        sendMessage("keyUp");
    
}