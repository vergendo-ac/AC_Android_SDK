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
 * @param latitude 
 * @param longitude 
 * @param altitude 
 * @param hdop 
 */

data class ImageDescriptionGps (
    @Json(name = "latitude")
    val latitude: kotlin.Double,
    @Json(name = "longitude")
    val longitude: kotlin.Double,
    @Json(name = "altitude")
    val altitude: kotlin.Double? = null,
    @Json(name = "hdop")
    val hdop: kotlin.Double? = null
)

