private eu.transkribus.swt_canvas.canvas.CanvasMode getModeForSelectionEvent(org.eclipse.swt.events.SelectionEvent e) {
    eu.transkribus.swt_canvas.canvas.CanvasMode mode = toolbar.getModeMap().get(e.getSource());
    return mode != null ? mode : eu.transkribus.swt_canvas.canvas.CanvasMode.SELECTION;
}