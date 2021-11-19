public static edu.sdsu.cs.sharepic.model.Account[] supportedAccounts(android.content.Context context) {
    if ((edu.sdsu.cs.sharepic.model.Account.accounts) == null) {
        edu.sdsu.cs.sharepic.model.Account.accounts = new edu.sdsu.cs.sharepic.model.Account[]{ edu.sdsu.cs.sharepic.model.FlickrAccount.getInstance(context) , edu.sdsu.cs.sharepic.model.Dropbox.getInstance(context) };
    }
    return edu.sdsu.cs.sharepic.model.Account.accounts;
}