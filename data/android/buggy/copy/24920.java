@org.unicaen.dnr2i.GoodDealsWS.resources.GET
@org.unicaen.dnr2i.GoodDealsWS.resources.Path(value = "/{offerId}")
public org.unicaen.dnr2i.GoodDealsWS.model.Offers getOffer(@org.unicaen.dnr2i.GoodDealsWS.resources.PathParam(value = "offerId")
long id) {
    return offerService.getOfferById(id);
}