/**
* Augmented City API
* ## Description This is an API for the Augmented City platform ## Other resources For more information, please visit our website [https://www.augmented.city](https://www.augmented.city/) 
*
* The version of the OpenAPI document: 2.0.0
* Contact: support@vergendo.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.ac.api.models


import com.squareup.moshi.Json

/**
 * 
 * @param stickerText 
 * @param stickerType 
 * @param path 
 * @param stickerSubtype 
 */

data class StickerData (
    @Json(name = "sticker_text")
    val stickerText: kotlin.String,
    @Json(name = "sticker_type")
    val stickerType: kotlin.String,
    @Json(name = "path")
    val path: kotlin.String,
    @Json(name = "sticker_subtype")
    val stickerSubtype: kotlin.String? = null,
    @Json(name = "sticker_id")
    val stickerId: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.String>()
