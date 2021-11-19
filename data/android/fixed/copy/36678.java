public boolean accept(org.eclipse.draw2d.IFigure figure) {
    boolean value = peekInheritedInteractiveEdit(figure);
    if ((inheritedInteractiveStack.length()) > 0)
        inheritedInteractiveStack.clear(((inheritedInteractiveStack.length()) - 1));
    
    return value;
}