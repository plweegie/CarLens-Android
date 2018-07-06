package co.netguru.android.carrecognition.feature.camera

import android.media.Image
import co.netguru.android.carrecognition.data.recognizer.Car
import com.google.ar.core.HitResult
import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView


interface CameraContract {
    interface View : MvpView {
        fun createAnchor(hitPoint: HitResult, text: String)
        fun acquireFrame(): Image?
        fun updateViewFinder(viewfinderSize: Float)
        fun showViewFinder()
        fun frameStreamEnabled(enabled: Boolean)
        fun showDetails(label: Car)
        fun tryAttachPin()
    }
    interface Presenter: MvpPresenter<View> {
        fun processHitResult(hitPoint: HitResult?)
        fun frameUpdated()
        fun bottomSheetHidden()
    }
}