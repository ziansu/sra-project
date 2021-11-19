public void removeElement(edu.istic.tdf.dfclient.domain.element.Element element) {
    ((edu.istic.tdf.dfclient.domain.element.mean.IMean) (element)).setState(MeanState.RELEASED);
    mListener.handleValidation(element);
}