@org.unicaen.dnr2i.GoodDealsWS.resources.GET
public org.unicaen.dnr2i.GoodDealsWS.model.Offers getOffer() {
    return offerService.getOfferById();
}