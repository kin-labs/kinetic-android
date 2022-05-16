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
 * @param id 
 * @param createdAt 
 * @param updatedAt 
 * @param amount 
 * @param destination 
 * @param errors 
 * @param feePayer 
 * @param mint 
 * @param signature 
 * @param solanaStart 
 * @param solanaEnd 
 * @param source 
 * @param status 
 * @param webhookEventStart 
 * @param webhookEventEnd 
 * @param webhookVerifyStart 
 * @param webhookVerifyEnd 
 */

data class AppTransaction (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime,

    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime,

    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    @Json(name = "destination")
    val destination: kotlin.String,

    @Json(name = "errors")
    val errors: kotlin.collections.List<kotlin.String>,

    @Json(name = "feePayer")
    val feePayer: kotlin.String,

    @Json(name = "mint")
    val mint: kotlin.String,

    @Json(name = "signature")
    val signature: kotlin.String,

    @Json(name = "solanaStart")
    val solanaStart: java.time.OffsetDateTime,

    @Json(name = "solanaEnd")
    val solanaEnd: java.time.OffsetDateTime,

    @Json(name = "source")
    val source: kotlin.String,

    @Json(name = "status")
    val status: kotlin.Any,

    @Json(name = "webhookEventStart")
    val webhookEventStart: java.time.OffsetDateTime,

    @Json(name = "webhookEventEnd")
    val webhookEventEnd: java.time.OffsetDateTime,

    @Json(name = "webhookVerifyStart")
    val webhookVerifyStart: java.time.OffsetDateTime,

    @Json(name = "webhookVerifyEnd")
    val webhookVerifyEnd: java.time.OffsetDateTime

)

