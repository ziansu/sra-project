public javax.swing.JScrollPane getDisplayedPhylogeny() {
    javax.swing.JScrollPane scroller = new javax.swing.JScrollPane();
    scroller = new javax.swing.JScrollPane(this.displayedPhylogeny, javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scroller.setViewportView(this.displayedPhylogeny);
    return scroller;
}