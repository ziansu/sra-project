@org.springframework.web.bind.annotation.RequestMapping(value = "/customer/wallets/new", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.neemre.bitplexus.common.dto.WalletDto viewShowCreateNew5(org.springframework.ui.ModelMap model) {
    return walletService.createNewWallet(new com.neemre.bitplexus.common.dto.WalletDto(null, "rebel_sloth", null, "My new wallet", null, null));
}