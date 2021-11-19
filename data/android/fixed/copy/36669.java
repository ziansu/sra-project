@org.springframework.web.bind.annotation.RequestMapping(value = "/groups/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addNewRootGroup(org.springframework.ui.Model mode, @org.springframework.web.bind.annotation.RequestParam(value = "value")
java.lang.String groupName) {
    if ((deviceService.insertGroup(groupName)) != null) {
        return java.lang.Boolean.toString(true);
    }else {
        return java.lang.Boolean.toString(false);
    }
}