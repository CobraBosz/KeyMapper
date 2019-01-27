package io.github.sds100.keymapper.Utils

import android.annotation.SuppressLint
import android.content.Context
import android.media.AudioManager
import androidx.annotation.IntDef

/**
 * Created by sds100 on 21/10/2018.
 */

object VolumeUtils {
    @SuppressLint("InlinedApi")
    @IntDef(value = [
        AudioManager.ADJUST_LOWER,
        AudioManager.ADJUST_RAISE,
        AudioManager.ADJUST_SAME,

        AudioManager.ADJUST_MUTE,
        AudioManager.ADJUST_UNMUTE,
        AudioManager.ADJUST_TOGGLE_MUTE
    ])
    @Retention(AnnotationRetention.SOURCE)
    annotation class AdjustMode

    /**
     * @param adjustMode must be one of the AudioManager.ADJUST... values
     */
    fun adjustVolume(ctx: Context,
                     @AdjustMode adjustMode: Int,
                     showVolumeUi: Boolean = false) {
        val audioManager = ctx.applicationContext.getSystemService(Context.AUDIO_SERVICE)
                as AudioManager

        val flag = if (showVolumeUi) {
            AudioManager.FLAG_SHOW_UI
        } else {
            0
        }

        audioManager.adjustVolume(adjustMode, flag)
    }
}