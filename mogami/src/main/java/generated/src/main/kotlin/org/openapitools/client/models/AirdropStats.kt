/**
 * Mogami
 *
 * The Mogami API description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.AirdropStatsCounts

import com.squareup.moshi.Json

/**
 * 
 *
 * @param counts 
 * @param dates 
 */

data class AirdropStats (

    @Json(name = "counts")
    val counts: AirdropStatsCounts,

    @Json(name = "dates")
    val dates: kotlin.collections.List<kotlin.String>

)

