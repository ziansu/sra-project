@org.springframework.web.bind.annotation.RequestMapping(value = "/findByStorageId", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object findByStorageId(@org.springframework.web.bind.annotation.RequestParam
int storageID, @org.springframework.web.bind.annotation.RequestParam
int npoint) {
    return coldStorageDoorService.findByStorageId(storageID, npoint);
}