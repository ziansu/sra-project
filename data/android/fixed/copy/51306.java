@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/inputArray", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.lrpb.demo.devActivity.beans.InputArraySessionBean setInputArray(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
org.lrpb.demo.devActivity.beans.InputArraySessionBean pInputArray) {
    inputArray.assing(pInputArray);
    return inputArray;
}