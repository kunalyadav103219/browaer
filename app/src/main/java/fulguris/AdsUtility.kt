//package fulguris
//
//import com.google.android.gms.ads.R
//import android.app.Activity
//import android.content.Context
//import android.util.Log
//import android.view.View
//import android.widget.*
//import androidx.appcompat.widget.LinearLayoutCompat
//import androidx.lifecycle.Lifecycle
//
////import com.applovin.mediation.MaxAd
////import com.applovin.mediation.MaxAdListener
////import com.applovin.mediation.MaxError
////import com.applovin.mediation.ads.MaxInterstitialAd
////import com.applovin.mediation.nativeAds.MaxNativeAdListener
////import com.applovin.mediation.nativeAds.MaxNativeAdLoader
////import com.applovin.mediation.nativeAds.MaxNativeAdView
////import com.applovin.sdk.AppLovinSdk
//import com.google.android.gms.ads.*
//import com.google.android.gms.ads.interstitial.InterstitialAd
//import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
//import com.google.android.gms.ads.nativead.MediaView
//import com.google.android.gms.ads.nativead.NativeAd
//import com.google.android.gms.ads.nativead.NativeAdOptions
//import com.google.android.gms.ads.nativead.NativeAdView
//
//class AdsUtility {
//
//
//    companion object {
//
//
//        fun initializeLovinSdk(context: Context, activity: Activity) {
////            if(Config.isNativeAdmobAds){
////                loadNative(activity)
////                loadNativeSmall(activity)
////                requestNewInterstitial(activity)
////            }else {
////                if ( !AppLovinSdk.getInstance(context).isInitialized) {
////                    AppLovinSdk.getInstance(context).mediationProvider = "max"
////                    AppLovinSdk.getInstance(context).initializeSdk {
////                        Log.d("mediato","yes")
////                        createInterstitialAd(activity)
////                    }
////                }else{
//////                    createInterstitialAd(activity)
//        }
//
////
////            }
////        }
////        private var maxInterstitialAd: MaxInterstitialAd? = null
////        private const val retryAttempt = 0
//
////        fun createInterstitialAd(activity: Activity) {
////            maxInterstitialAd = MaxInterstitialAd(activity.getString(R.string.flow_interstitial), activity)
////            maxInterstitialAd!!.setListener(object : MaxAdListener {
////                override fun onAdLoaded(p0: MaxAd) {
////
//////                    maxInterstitialAd=p0
////                }
////
////                override fun onAdDisplayed(p0: MaxAd) {
////                    Log.d("mediato","why")
////                }
////
////                override fun onAdHidden(p0: MaxAd) {
////                    maxInterstitialAd?.loadAd()
////                }
////
////                override fun onAdClicked(p0: MaxAd) {
////                }
////
////                override fun onAdLoadFailed(p0: String, p1: MaxError) {
////                    Log.d("mediato",""+p0+p1.toString())
////                }
////
////                override fun onAdDisplayFailed(p0: MaxAd, p1: MaxError) {
////                    Log.d("mediato",""+p1.toString())
////                    maxInterstitialAd?.loadAd()
////                }
////
////            })
////
////            maxInterstitialAd!!.loadAd()
////        }
//
//
//        var mInterstitialAd: InterstitialAd? = null
//
//        //        private var mMaxInterstitialAd: MaxInterstitialAd? = null
//        fun requestNewInterstitial(activity: Activity) {
//
//            val adRequest = AdRequest.Builder().build()
//            InterstitialAd.load(activity,
//                activity.resources.getString(R),
//                adRequest,
//                object : InterstitialAdLoadCallback() {
//                    override fun onAdLoaded(interstitialAd: InterstitialAd) {
//                        mInterstitialAd = interstitialAd
//                        println("ffgh" + "load")
//                    }
//
//                    override fun onAdFailedToLoad(loadAdError: LoadAdError) {
//                        mInterstitialAd = null
//                        println("ffgh" + "loadno")
//                    }
//                }
//            )
//
//        }
//
//        var count = 0
//        lateinit var context: Context
//        fun showInter(
//            activity: Activity,
//            onShowAdCompleteListener: OnShowAdCompleteListener,
//            lifecycle: Lifecycle
//        ) {
//
//
//            if (!Config.isAdsSubscriptionActivated) {
//
//                if (Config.isNativeAdmobAds) {
////                    count++
//
//
//                    if (mInterstitialAd != null) {
//
//                        Log.d("whynot", "")
//                        mInterstitialAd?.show(activity)
//                        mInterstitialAd?.fullScreenContentCallback =
//                            object : FullScreenContentCallback() {
//                                override fun onAdDismissedFullScreenContent() {
//                                    onShowAdCompleteListener.onShowAdComplete()
//                                    requestNewInterstitial(activity)
//                                    super.onAdDismissedFullScreenContent()
//                                }
//                            }
//                    } else {
//                        onShowAdCompleteListener.onShowAdComplete()
//                        if (mInterstitialAd == null) {
//                            requestNewInterstitial(activity)
//                        }
//                    }
//                } else {
////                    count++
//                    Log.d("mediato", "" + "p1.toString()")
////                    if (maxInterstitialAd?.isReady==true){
////                        maxInterstitialAd?.showAd()
////                        maxInterstitialAd?.setListener(object : MaxAdListener {
////                            override fun onAdLoaded(p0: MaxAd) {
////
//////                    maxInterstitialAd=p0
////                            }
////
////                            override fun onAdDisplayed(p0: MaxAd) {
////                                Log.d("mediato","why")
////                            }
////
////                            override fun onAdHidden(p0: MaxAd) {
////
////                                onShowAdCompleteListener.onShowAdComplete()
////                                createInterstitialAd(activity)
////                            }
////
////                            override fun onAdClicked(p0: MaxAd) {
////                            }
////
////                            override fun onAdLoadFailed(p0: String, p1: MaxError) {
////                                Log.d("mediato",""+p0+p1.toString())
////                            }
////
////                            override fun onAdDisplayFailed(p0: MaxAd, p1: MaxError) {
////                                onShowAdCompleteListener.onShowAdComplete()
////                                createInterstitialAd(activity)
////                            }
//
////                        })
////
////                    }else{
////                        onShowAdCompleteListener.onShowAdComplete()
////                        createInterstitialAd(activity)
////                    }
//                }
//            } else {
//                onShowAdCompleteListener.onShowAdComplete()
//            }
//
//        }
//
//        fun showInterWithoutCount(
//            activity: Activity,
//            onShowAdCompleteListener: OnShowAdCompleteListener
//        ) {
//            if (!Config.isAdsSubscriptionActivated) {
//
//                if (Config.isNativeAdmobAds) {
////                count++
//                    if (mInterstitialAd != null) {
//                        Log.d("whynot", "")
//                        mInterstitialAd?.show(activity)
//                        mInterstitialAd?.fullScreenContentCallback =
//                            object : FullScreenContentCallback() {
//                                override fun onAdDismissedFullScreenContent() {
//                                    onShowAdCompleteListener.onShowAdComplete()
//                                    requestNewInterstitial(activity)
//                                    super.onAdDismissedFullScreenContent()
//                                }
//                            }
//                    } else {
//                        onShowAdCompleteListener.onShowAdComplete()
//                    }
//                } else {
//                    count++
//                    Log.d("mediato", "" + "p1.toString()")
////                    if (maxInterstitialAd?.isReady == true){
////                        maxInterstitialAd?.showAd()
////                        maxInterstitialAd?.setListener(object : MaxAdListener {
////                            override fun onAdLoaded(p0: MaxAd) {
////
//////                    maxInterstitialAd=p0
////                            }
////
////                            override fun onAdDisplayed(p0: MaxAd) {
////                                Log.d("mediato","why")
////                            }
////
////                            override fun onAdHidden(p0: MaxAd) {
////
////                                onShowAdCompleteListener.onShowAdComplete()
////                                createInterstitialAd(activity)
////                            }
////
////                            override fun onAdClicked(p0: MaxAd) {
////                            }
////
////                            override fun onAdLoadFailed(p0: String, p1: MaxError) {
////                                Log.d("mediato",""+p0+p1.toString())
////                            }
////
////                            override fun onAdDisplayFailed(p0: MaxAd, p1: MaxError) {
////                                onShowAdCompleteListener.onShowAdComplete()
////                                createInterstitialAd(activity)
////                            }
////
////                        })
////
////                    }else{
////                        onShowAdCompleteListener.onShowAdComplete()
////                        createInterstitialAd(activity)
////                    }
//                }
//            } else {
//                onShowAdCompleteListener.onShowAdComplete()
//            }
//
//        }
//
//        interface OnShowAdCompleteListener {
//            fun onShowAdComplete()
//        }
//
//        fun inflateNative(frameLayout: FrameLayout, activity: Activity) {
//
////            try {
////                if (nativeAd3 != null) {
////                    val adView = activity.layoutInflater
////                        .inflate(
////                            R.layout.native_admob_ad, null
////                        ) as NativeAdView
////                    frameLayout.visibility = View.VISIBLE
////                    nativeAd3?.let { populateUnifiedNativeAdView(it, adView) }
////                    frameLayout.removeAllViews()
////                    frameLayout.addView(adView)
////                } else {
////                    loadNativeView(frameLayout, activity)
////                }
////            } catch (e: Exception) {
////                e.printStackTrace()
////            }
//
//        }
//
//        fun inflateNativeSmall(frameLayout: FrameLayout, activity: Activity) {
////            try {
////                if (Config.isNativeAdmobAds) {
////                    try {
////                        if (nativeAd3 != null) {
////                            val adView = activity.layoutInflater
////                                .inflate(
////                                    R.layout.native_admob_ad_small, null
////                                ) as NativeAdView
////                            frameLayout.visibility = View.VISIBLE
////                            nativeAd3?.let { populateSmallNativeAdView(it, adView) }
////                            frameLayout.removeAllViews()
////                            frameLayout.addView(adView)
////                        } else {
////                            loadNativeViewSmall(frameLayout, activity)
////                        }
////                    } catch (e: Exception) {
////                        e.printStackTrace()
////                    }
////                } else {
//////                    loadNativeViewSmallLovin(frameLayout,activity)
////                }
////            } catch (e: Exception) {
////                e.printStackTrace()
////            }
//        }
//
//        fun inflateGenericNative(frameLayout: FrameLayout, activity: Activity) {
////            if (Config.isNativeAdmobAds) {
////                try {
////                    if (nativeAd3 != null) {
////                        val adView = activity.layoutInflater
////                            .inflate(
////                                R.layout.native_admob_ad_small, null
////                            ) as NativeAdView
////                        frameLayout.visibility = View.VISIBLE
////                        nativeAd3?.let { populateSmallNativeAdView(it, adView) }
////                        frameLayout.removeAllViews()
////                        frameLayout.addView(adView)
////                    } else {
////                        loadNativeViewSmall(frameLayout, activity)
////                    }
////                } catch (e: Exception) {
////                    e.printStackTrace()
////                }
////            } else {
//////                loadNativeViewSmallLovin(frameLayout,activity)
////            }
//        }
//
//        fun inflateGenericNativeLarge(frameLayout: FrameLayout, activity: Activity) {
////            if (Config.isNativeAdmobAds) {
////                try {
////                    if (nativeAd4 != null) {
////                        val adView = activity.layoutInflater
////                            .inflate(
////                                R.layout.native_admob_ad, null
////                            ) as NativeAdView
////                        frameLayout.visibility = View.VISIBLE
////                        nativeAd4?.let { populateUnifiedNativeAdView(it, adView) }
////                        frameLayout.removeAllViews()
////                        frameLayout.addView(adView)
////                    } else {
////                        loadNativeView(frameLayout, activity)
////                    }
////                } catch (e: Exception) {
////                    e.printStackTrace()
////                }
////            } else {
//////                loadNativeViewLovin(frameLayout,activity)
////            }
//        }
////        fun inflateGenericNative(frameLayout: LinearLayoutCompat,context:Context,lifecycle: Lifecycle){
////            AdSdk.loadAd(
////                context = context,
////                lifecycle = lifecycle,
////                parentView = frameLayout,
////                adName = "Generic_Native"
////            )
////            frameLayout.visibility=View.VISIBLE
////        }
//
//
////        private lateinit var nativeAdLoader2: MaxNativeAdLoader
////        private var nativeAd2: MaxAd? = null
//
//
////        private lateinit var nativeAdLoader: MaxNativeAdLoader
////        private var nativeAd: MaxAd? = null
//
//
////        fun loadNativeViewLovin(frameLayout: FrameLayout, activity: Activity) {
////            nativeAdLoader2 = MaxNativeAdLoader( activity.getString(R.string.MVideo_Crafting_Native), activity )
////            nativeAdLoader2.setNativeAdListener(object : MaxNativeAdListener() {
////
////                override fun onNativeAdLoaded(nativeAdView: MaxNativeAdView?, ad: MaxAd)
////                {
////                    // Clean up any pre-existing native ad to prevent memory leaks.
////                    if ( nativeAd2 != null )
////                    {
////                        nativeAdLoader2.destroy( nativeAd2 )
////                    }
////
////                    // Save ad for cleanup.
////                    nativeAd2 = ad
////
////                    // Add ad view to view.
////                    frameLayout.removeAllViews()
////                    frameLayout.addView( nativeAdView )
////                }
////
//////                override fun onNativeAdLoadFailed(adUnitId: String, error: MaxError)
//////                {
//////                    // We recommend retrying with exponentially higher delays up to a maximum delay
//////                }
//////
//////                override fun onNativeAdClicked(ad: MaxAd)
//////                {
//////                    // Optional click callback
//////                }
////            })
////            nativeAdLoader2.loadAd()
////        }
////        fun loadNativeViewSmallLovin(frameLayout: FrameLayout, activity: Activity) {
////            nativeAdLoader = MaxNativeAdLoader( activity.getString(R.string.MVideo_Crafting_Native), activity )
////            nativeAdLoader.setNativeAdListener(object : MaxNativeAdListener() {
////
////                override fun onNativeAdLoaded(nativeAdView: MaxNativeAdView?, ad: MaxAd)
////                {
////                    // Clean up any pre-existing native ad to prevent memory leaks.
////                    if ( nativeAd != null )
////                    {
////                        nativeAdLoader.destroy( nativeAd )
////                    }
////
////                    // Save ad for cleanup.
////                    nativeAd = ad
////
////                    // Add ad view to view.
////                    frameLayout.removeAllViews()
////                    frameLayout.addView( nativeAdView )
////                    frameLayout.layoutParams=FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,120)
////                }
////
////                override fun onNativeAdLoadFailed(adUnitId: String, error: MaxError)
////                {
////                    // We recommend retrying with exponentially higher delays up to a maximum delay
////                }
////
////                override fun onNativeAdClicked(ad: MaxAd)
////                {
////                    // Optional click callback
////                }
////            })
////            nativeAdLoader.loadAd()
////        }
//
//
//        private var nativeAd3: NativeAd? = null
//
//
//        fun loadNativeView(frameLayout: FrameLayout, activity: Activity) {
//
////            if (Config.isNativeAdmobAds) {
////                try {
////                    if (nativeAd3 != null) {
////                        val adView = activity.layoutInflater
////                            .inflate(
////                                R.layout.native_admob_ad_small, null
////                            ) as NativeAdView
////                        frameLayout.visibility = View.VISIBLE
////                        nativeAd3?.let { populateSmallNativeAdView(it, adView) }
////                        frameLayout.removeAllViews()
////                        frameLayout.addView(adView)
////                    } else {
////                        loadNativeViewSmall1(frameLayout, activity)
////                    }
////                } catch (e: Exception) {
////                    e.printStackTrace()
////                }
////            } else {
//////                loadNativeViewSmallLovin1(frameLayout,activity)
////            }
//        }
//
////        private fun loadNativeViewSmallLovin1(frameLayout: FrameLayout, activity: Activity) {
////            nativeAdLoader = MaxNativeAdLoader( activity.getString(R.string.Mvmaker_ExitNative), activity )
////            nativeAdLoader.setNativeAdListener(object : MaxNativeAdListener() {
////
////                override fun onNativeAdLoaded(nativeAdView: MaxNativeAdView?, ad: MaxAd)
////                {
////                    // Clean up any pre-existing native ad to prevent memory leaks.
////                    if ( nativeAd != null )
////                    {
////                        nativeAdLoader.destroy( nativeAd )
////                    }
////
////                    // Save ad for cleanup.
////                    nativeAd = ad
////
////                    // Add ad view to view.
////                    frameLayout.removeAllViews()
////                    frameLayout.addView( nativeAdView )
////                    frameLayout.layoutParams=FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,120)
////                }
////
////                override fun onNativeAdLoadFailed(adUnitId: String, error: MaxError)
////                {
////                    // We recommend retrying with exponentially higher delays up to a maximum delay
////                }
////
////                override fun onNativeAdClicked(ad: MaxAd)
////                {
////                    // Optional click callback
////                }
////            })
////            nativeAdLoader.loadAd()
////        }
//
//
//        private fun loadNativeViewSmall1(frameLayout: FrameLayout, activity: Activity) {
////            try {
////                val videoOptions = VideoOptions.Builder()
////                    .setStartMuted(false)
////                    .build()
////                val nativeAdOptions = NativeAdOptions.Builder()
////                nativeAdOptions.setVideoOptions(videoOptions)
////                val adOptions = nativeAdOptions.build()
////                val adLoader =
////                    AdLoader.Builder(activity, activity.getString(R.string.Mvmaker_ExitNative))
////                        .forNativeAd { nativeAd2: NativeAd ->
////                            if (nativeAd3 != null) {
////                                nativeAd3!!.destroy()
////                            }
//////                    try {
////                            nativeAd3 = nativeAd2
//////                    val frameLayout = binding.flAdplaceholder2
////                            val adView = activity.layoutInflater
////                                .inflate(
////                                    R.layout.native_admob_ad_small, null
////                                ) as NativeAdView
////                            nativeAd3?.let { populateSmallNativeAdView(it, adView) }
////                            frameLayout.removeAllViews()
////                            frameLayout.addView(adView)
////                        }
////                        .withAdListener(object : AdListener() {
////                            override fun onAdLoaded() {
////                                try {
////                                    frameLayout.visibility = View.VISIBLE
//////                            dialog.findViewById<View>(R.id.fl_adplaceholder2).visibility = View.VISIBLE
////                                } catch (e: Exception) {
////                                    e.printStackTrace()
////                                }
////                                super.onAdLoaded()
////                            }
////
////                            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
////                                super.onAdFailedToLoad(loadAdError)
////                            } //                    }
////                        })
////                        .withNativeAdOptions(adOptions)
////                        .build()
////                adLoader.loadAd(AdRequest.Builder().build())
////            } catch (e: NullPointerException) {
////                e.printStackTrace()
////            }
//        }
//
//        fun loadNativeViewSmall(frameLayout: FrameLayout, activity: Activity) {
//
////            try {
////                val videoOptions = VideoOptions.Builder()
////                    .setStartMuted(false)
////                    .build()
////                val nativeAdOptions = NativeAdOptions.Builder()
////                nativeAdOptions.setVideoOptions(videoOptions)
////                val adOptions = nativeAdOptions.build()
////                val adLoader =
////                    AdLoader.Builder(
////                        activity,
////                        activity.getString(R.string.MVideo_Crafting_Native)
////                    )
////                        .forNativeAd { nativeAd2: NativeAd ->
////                            if (nativeAd3 != null) {
////                                nativeAd3!!.destroy()
////                            }
//////                    try {
////                            nativeAd3 = nativeAd2
//////                    val frameLayout = binding.flAdplaceholder2
////                            val adView = activity.layoutInflater
////                                .inflate(
////                                    R.layout.native_admob_ad_small, null
////                                ) as NativeAdView
////                            nativeAd3?.let { populateSmallNativeAdView(it, adView) }
////                            frameLayout.removeAllViews()
////                            frameLayout.addView(adView)
////                        }
////                        .withAdListener(object : AdListener() {
////                            override fun onAdLoaded() {
////                                try {
////                                    frameLayout.visibility = View.VISIBLE
//////                            dialog.findViewById<View>(R.id.fl_adplaceholder2).visibility = View.VISIBLE
////                                } catch (e: Exception) {
////                                    e.printStackTrace()
////                                }
////                                super.onAdLoaded()
////                            }
////
////                            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
////                                super.onAdFailedToLoad(loadAdError)
////                            } //                    }
////                        })
////                        .withNativeAdOptions(adOptions)
////                        .build()
////                adLoader.loadAd(AdRequest.Builder().build())
////            } catch (e: NullPointerException) {
////                e.printStackTrace()
////            }
//        }
//
//        fun loadNative(activity: Activity) {
//
//
////            try {
////                val videoOptions = VideoOptions.Builder()
////                    .setStartMuted(false)
////                    .build()
////                val nativeAdOptions = NativeAdOptions.Builder()
////                nativeAdOptions.setVideoOptions(videoOptions)
////                val adOptions = nativeAdOptions.build()
////                val adLoader =
////                    AdLoader.Builder(activity, activity.getString(R.string.Mvmaker_ExitNative))
////                        .forNativeAd { nativeAd2: NativeAd ->
////                            if (nativeAd4 != null) {
////                                nativeAd4!!.destroy()
////                            }
////                            nativeAd4 = nativeAd2
////                        }
////                        .withAdListener(object : AdListener() {
////                            override fun onAdLoaded() {
////                                try {
////
////                                } catch (e: Exception) {
////                                    e.printStackTrace()
////                                }
////                                super.onAdLoaded()
////                            }
////
////                            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
////                                super.onAdFailedToLoad(loadAdError)
////                            } //                    }
////                        })
////                        .withNativeAdOptions(adOptions)
////                        .build()
////                adLoader.loadAd(AdRequest.Builder().build())
////            } catch (e: NullPointerException) {
////                e.printStackTrace()
////            }
//        }
//
//        fun loadNativeSmall(activity: Activity) {
//
//
////            try {
////                val videoOptions = VideoOptions.Builder()
////                    .setStartMuted(false)
////                    .build()
////                val nativeAdOptions = NativeAdOptions.Builder()
////                nativeAdOptions.setVideoOptions(videoOptions)
////                val adOptions = nativeAdOptions.build()
////                val adLoader =
////                    AdLoader.Builder(
////                        activity,
////                        activity.getString(R.string.MVideo_Crafting_Native)
////                    )
////                        .forNativeAd { nativeAd2: NativeAd ->
////                            if (nativeAd3 != null) {
////                                nativeAd3!!.destroy()
////                            }
////                            nativeAd3 = nativeAd2
////                        }
////                        .withAdListener(object : AdListener() {
////                            override fun onAdLoaded() {
////                                try {
////
////                                } catch (e: Exception) {
////                                    e.printStackTrace()
////                                }
////                                super.onAdLoaded()
////                            }
////
////                            override fun onAdFailedToLoad(loadAdError: LoadAdError) {
////                                super.onAdFailedToLoad(loadAdError)
////                            } //                    }
////                        })
////                        .withNativeAdOptions(adOptions)
////                        .build()
////                adLoader.loadAd(AdRequest.Builder().build())
////            } catch (e: NullPointerException) {
////                e.printStackTrace()
////            }
//        }
//
//        private var nativeAd4: NativeAd? = null
//
//        fun populateSmallNativeAdView(nativeAd: NativeAd, adView: NativeAdView) {
//////        adView.mediaView = adView.findViewById(R.id.ad_media) as MediaView
////            adView.headlineView = adView.findViewById(R.id.ad_headline)
////            adView.bodyView = adView.findViewById(R.id.ad_body)
////            adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action))
////            adView.setIconView(adView.findViewById(R.id.ad_app_icon))
////            //adView.setPriceView(adView.findViewById(R.id.ad_price));
////            adView.setStarRatingView(adView.findViewById(R.id.ad_stars))
////            //adView.setStoreView(adView.findViewById(R.id.ad_store));
////            //adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));
////            (adView.getHeadlineView() as TextView).setText(nativeAd.getHeadline())
////            //adView.getMediaView().setMediaContent(nativeAd.getMediaContent());
////            if (nativeAd.getBody() == null) {
////                adView.bodyView?.setVisibility(View.INVISIBLE)
////            } else {
////                adView.bodyView?.setVisibility(View.VISIBLE)
////                (adView.getBodyView() as TextView).setText(nativeAd.getBody())
////            }
////            if (nativeAd.getCallToAction() == null) {
////                adView.callToActionView?.setVisibility(View.INVISIBLE)
////            } else {
////                adView.callToActionView?.setVisibility(View.VISIBLE)
////                (adView.getCallToActionView() as Button).setText(nativeAd.getCallToAction())
////            }
////            if (nativeAd.getIcon() == null) {
////                adView.iconView?.setVisibility(View.GONE)
////            } else {
////                (adView.getIconView() as ImageView).setImageDrawable(nativeAd.icon?.getDrawable())
////                adView.iconView?.setVisibility(View.VISIBLE)
////            }
////
////            /*if (nativeAd.getPrice() == null) {
////            adView.getPriceView().setVisibility(View.INVISIBLE);
////        } else {
////            adView.getPriceView().setVisibility(View.VISIBLE);
////            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
////        }*/
////
////            /*if (nativeAd.getStore() == null) {
////            adView.getStoreView().setVisibility(View.INVISIBLE);
////        } else {
////            adView.getStoreView().setVisibility(View.VISIBLE);
////            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
////        }*/if (nativeAd.getStarRating() == null) {
////                adView.starRatingView?.setVisibility(View.VISIBLE)
////                (adView.getStarRatingView() as RatingBar).rating = 4f
////            } else {
////                (adView.getStarRatingView() as RatingBar).rating =
////                    nativeAd.starRating?.toFloat()!!
////                adView.starRatingView?.setVisibility(View.VISIBLE)
////            }
////
////            /*if (nativeAd.getAdvertiser() == null) {
////            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
////        } else {
////            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
////            adView.getAdvertiserView().setVisibility(View.VISIBLE);
////        }*/adView.setNativeAd(nativeAd)
//        }
//
//        private fun populateUnifiedNativeAdView(nativeAd: NativeAd, adView: NativeAdView) {
////            val mediaView = adView.findViewById<MediaView>(R.id.ad_media)
////            //        MediaView mediaView = adView.findViewById(R.id.ad_media);
////            adView.setMediaView(mediaView)
////
////            // Set other ad assets.
//////            adView.setHeadlineView(adView.findViewById(R.id.ad_headline))
//////            adView.setBodyView(adView.findViewById(R.id.ad_body))
//////            adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action))
//////            adView.setIconView(adView.findViewById(R.id.ad_app_icon))
//////            adView.setPriceView(adView.findViewById(R.id.ad_price))
//////            adView.setStarRatingView(adView.findViewById(R.id.ad_stars))
//////            adView.setStoreView(adView.findViewById(R.id.ad_store))
//////            adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser))
////
////            // The headline is guaranteed to be in every UnifiedNativeAd.
////            (adView.headlineView as TextView).text = nativeAd.headline
////
////            // These assets aren't guaranteed to be in every UnifiedNativeAd, so it's important to
////            // check before trying to display them.
////            if (nativeAd.body == null) {
////                adView.bodyView?.visibility = View.INVISIBLE
////            } else {
////                adView.bodyView?.visibility = View.INVISIBLE
////                (adView.bodyView as TextView).text = nativeAd.body
////            }
////            if (nativeAd.callToAction == null) {
////                adView.callToActionView?.visibility = View.INVISIBLE
////            } else {
////                adView.callToActionView?.visibility = View.VISIBLE
////                (adView.callToActionView as TextView).text = nativeAd.callToAction
////            }
////            if (nativeAd.icon == null) {
////                adView.iconView?.visibility = View.GONE
////            } else {
////                (adView.iconView as ImageView).setImageDrawable(
////                    nativeAd.icon?.drawable
////                )
////                adView.iconView?.visibility = View.VISIBLE
////            }
////            try {
////                if (nativeAd.price == null) {
////                    adView.priceView?.visibility = View.INVISIBLE
////                } else {
////                    adView.priceView?.visibility = View.VISIBLE
////                    (adView.priceView as TextView).text = nativeAd.price
////                }
////            } catch (e: Exception) {
////
////            }
////            try {
////                if (nativeAd.store == null) {
////                    adView.storeView?.visibility = View.INVISIBLE
////                } else {
////                    adView.storeView?.visibility = View.VISIBLE
////                    (adView.storeView as TextView).text = nativeAd.store
////                }
////            } catch (e: Exception) {
////                e.printStackTrace()
////            }
////            try {
////                if (nativeAd.starRating == null) {
////                    adView.starRatingView?.visibility = View.INVISIBLE
////                } else {
////                    (adView.starRatingView as RatingBar).rating =
////                        nativeAd.starRating?.toFloat()!!
////                    adView.starRatingView?.visibility = View.VISIBLE
////                }
////                if (nativeAd.advertiser == null) {
////                    adView.advertiserView?.visibility = View.INVISIBLE
////                } else {
////                    (adView.advertiserView as TextView).text = nativeAd.advertiser
////                    adView.advertiserView?.visibility = View.VISIBLE
////                }
////            } catch (e: Exception) {
////                e.printStackTrace()
////            }
////
////            // This method tells the Google Mobile Ads SDK that you have finished populating your
////            // native ad view with this native ad. The SDK will populate the adView's MediaView
////            // with the media content from this native ad.
////            adView.setNativeAd(nativeAd)
//        }
//    }
//}