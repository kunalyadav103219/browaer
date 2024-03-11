package fulguris

import android.app.Activity
import android.content.Context
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.appopen.AppOpenAd

class AppOpenAdsManager(private val context: Context) {
    private var appOpenAd: AppOpenAd? = null
    var isShowingAd = false
    var isAdLoaded = false;

    interface OnAdCompleteListener {
        fun onAdComplete()
    }

    fun loadAd() {
        if (isShowingAd || appOpenAd != null) {
            return
        }
        val openString = context.getString(R.string.app_open)

        val adRequest = AdRequest.Builder().build()
        AppOpenAd.load(
            context, openString, adRequest,
            AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, object : AppOpenAd.AppOpenAdLoadCallback() {
                override fun onAdLoaded(ad: AppOpenAd) {
                    appOpenAd = ad
                    isAdLoaded = true;
                }

                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    // Handle the error.
                    isAdLoaded = false
                }
            })
    }

    fun showAdIfAvailable(activity: Activity, onAdCompleteListener: OnAdCompleteListener) {
        appOpenAd?.let { ad ->
            ad.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    appOpenAd = null
                    isShowingAd = false
                    onAdCompleteListener.onAdComplete()
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                    appOpenAd = null
                    isShowingAd = false
                    onAdCompleteListener.onAdComplete()
                }

                override fun onAdShowedFullScreenContent() {
                    isShowingAd = true
                }
            }

            ad.show(activity)
        } ?: onAdCompleteListener.onAdComplete() // If ad is not available, proceed with onAdCompleteListener logic.
    }
}
