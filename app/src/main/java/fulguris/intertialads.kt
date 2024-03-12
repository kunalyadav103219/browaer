package fulguris


import android.app.Activity
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.admanager.AdManagerAdRequest
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback

object intertialads {

    private var interstitialAd: AdManagerInterstitialAd? = null
    private var isAdloaded=false
    fun loadInterstitial(context: Context):Boolean {
        Log.d("InterstitialAdsManager", "Loading interstitial ad...")
        val adRequest = AdManagerAdRequest.Builder().build()
        AdManagerInterstitialAd.load(context, "ca-app-pub-3940256099942544/1033173712", adRequest, object : AdManagerInterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.e("InterstitialAdsManager", "Interstitial ad failed to load: ${adError.message}")
                isAdloaded=true
            }

            override fun onAdLoaded(ad: AdManagerInterstitialAd) {
                Log.d("InterstitialAdsManager", "Interstitial ad loaded successfully")
                interstitialAd = ad

            }


        })
        return false
    }

    fun showInterstital(activity: Activity) {
        if (interstitialAd != null) {
            interstitialAd!!.fullScreenContentCallback = object : FullScreenContentCallback() {
                override fun onAdDismissedFullScreenContent() {
                    Log.d("InterstitialAdsManager", "Interstitial ad dismissed")
                    interstitialAd = null
                    loadInterstitial(activity)
                }

                override fun onAdFailedToShowFullScreenContent(adError: AdError) {
                    Log.e("InterstitialAdsManager", "Interstitial ad failed to show: ${adError.message}")
                    interstitialAd = null
                    loadInterstitial(activity)
                }
            }
            interstitialAd!!.show(activity)
        } else {
            Log.e("InterstitialAdsManager", "Interstitial ad is null or not loaded")
            loadInterstitial(activity)
        }
    }
}