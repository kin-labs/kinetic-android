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
 * @param account 
 * @param signature 
 * @param status 
 */

data class CreateAccountResponse (

    @Json(name = "account")
    val account: kotlin.Any,

    @Json(name = "signature")
    val signature: kotlin.String,

    @Json(name = "status")
    val status: kotlin.String

)

