public void addBuffer(org.eclipse.jdt.core.IBuffer buffer) {
    if ((buffer.getContents()) == null)
        return ;
    
    super.addBuffer(buffer);
}