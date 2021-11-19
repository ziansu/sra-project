public void setFormula(java.lang.String latex) {
    this.mLatex = latex;
    mTexFormula.setLaTeX(latex);
    mTexIcon = mBuilder.build();
}