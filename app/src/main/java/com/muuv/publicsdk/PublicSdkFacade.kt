package com.muuv.publicsdk

import android.telephony.PhoneNumberUtils
import com.muuv.spikesdk.util.SpikePhoneValidator

object PublicSdkFacade {

    fun validatePhone(phone: String?): Boolean {
        return SpikePhoneValidator.validatePhone(phone)
    }

    fun formatPhoneWithCountry(phone: String, countryISO: String): String? {
        return SpikePhoneValidator.formatPhoneWithCountry(phone, countryISO)
    }
}