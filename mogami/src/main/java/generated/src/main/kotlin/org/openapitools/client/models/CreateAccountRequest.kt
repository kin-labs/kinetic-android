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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param index 
 * @param tx 
 */

data class CreateAccountRequest (

    @Json(name = "index")
    val index: java.math.BigDecimal,

    @Json(name = "tx")
    val tx: kotlin.Any

)

