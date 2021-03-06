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

import com.ac.api.models.ScanDaytime
import com.ac.api.models.ScanPassage

import com.squareup.moshi.Json

/**
 * 
 * @param client Application name
 * @param daytime 
 * @param device Phone or camera model
 * @param name Location name
 * @param passages 
 * @param user User login or id
 */

data class ScanSeriesDescription (
    /* Application name */
    @Json(name = "client")
    val client: kotlin.String,
    @Json(name = "daytime")
    val daytime: ScanDaytime,
    /* Phone or camera model */
    @Json(name = "device")
    val device: kotlin.String,
    /* Location name */
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "passages")
    val passages: kotlin.collections.List<ScanPassage>,
    /* User login or id */
    @Json(name = "user")
    val user: kotlin.String
)

