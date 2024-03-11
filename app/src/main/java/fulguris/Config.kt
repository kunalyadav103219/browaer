package fulguris

class Config {
    companion object {
        /*in app billing ids'*/
        const val remove_ads_one_month: String = "remove_ads_one_month"
        const val remove_ads_three_month: String = "remove_ads_three_month"
        const val remove_ads_six_month: String = "remove_ads_six_month"
        const val remove_ads_one_year: String = "remove_ads_one_year"

        //don't change these values will be controlled automatically with application flow.
        var isAdsSubscriptionActivated: Boolean = false
        var isAds: Boolean = false
        var isNativeAdmobAds=true
        var billingConnected: Boolean = false
    }
}