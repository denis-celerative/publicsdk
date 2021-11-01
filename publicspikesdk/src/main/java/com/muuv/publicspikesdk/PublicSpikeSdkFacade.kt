package com.muuv.publicspikesdk

import android.telephony.PhoneNumberUtils
import com.muuv.spikesdk.util.SpikePhoneValidator

object PublicSpikeSdkFacade {

    fun validatePhone(phone: String?): Boolean {
        return SpikePhoneValidator.validatePhone(phone)
    }

    fun formatPhoneWithCountry(phone: String, countryISO: String): String? {
        return SpikePhoneValidator.formatPhoneWithCountry(phone, countryISO)
    }
}