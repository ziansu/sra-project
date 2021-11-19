@com.oncheck.tipSystem.RequestMapping(value = "/tips", method = RequestMethod.GET)
public java.lang.Iterable<com.oncheck.tipSystem.Tip> getTips() {
    return tipRepository.findAll();
}