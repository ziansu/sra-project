@org.springframework.web.bind.annotation.RequestMapping(value = "/activitySubscriptions/{pk}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public boolean deleteActivitySubscription(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long pk) throws org.xcolab.service.activities.exceptions.NotFoundException {
    if ((pk == null) || (pk == 0)) {
        throw new org.xcolab.service.activities.exceptions.NotFoundException("No activitySubscriptions with id given");
    }else {
        this.activitySubscriptionDao.delete(pk);
        return true;
    }
}