//import android.content.Context
//import android.util.Log
//import com.google.android.gms.ads.AdListener
//import com.google.android.gms.ads.AdRequest
//import com.google.android.gms.ads.interstitial.InterstitialAd
//
//
//class InterstitialAdManager(context: Context, adUnitId: String) {
//    private val mInterstitialAd: InterstitialAd = InterstitialAd(context)
//    private var clickCount = 0
//    private val CLICK_THRESHOLD = 4
//
//    init {
//        // Initialize InterstitialAd
//        mInterstitialAd.adUnitId = adUnitId
//        mInterstitialAd.loadAd(AdRequest.Builder().build())
//
//        // Set up ad listener
//        mInterstitialAd.adListener = object : AdListener() {
//            override fun onAdClosed() {
//                // Load the next interstitial ad
//                mInterstitialAd.loadAd(AdRequest.Builder().build())
//            }
//
//            override fun onAdLoaded() {
//                // Handle ad loaded event if needed
//            }
//        }
//    }
//
//    fun handleClick() {
//        // Increment click count
//        clickCount++
//
//        // Check if it's time to show the interstitial ad
//        if (clickCount % CLICK_THRESHOLD == 0) {
//            if (mInterstitialAd.isLoaded) {
//                mInterstitialAd.show()
//            } else {
//                Log.d("InterstitialAdManager", "The interstitial wasn't loaded yet.")
//            }
//        }
//    }
//}
