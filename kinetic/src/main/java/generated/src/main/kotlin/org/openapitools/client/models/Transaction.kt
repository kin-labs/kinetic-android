/**
 * @kin-kinetic/api
 *
 * The OpenAPI definition of the Kinetic API
 *
 * The version of the OpenAPI document: 1.0.0-rc.0
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

import org.openapitools.client.models.TransactionError

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param createdAt 
 * @param updatedAt 
 * @param amount 
 * @param decimals 
 * @param destination 
 * @param errors 
 * @param explorerUrl 
 * @param feePayer 
 * @param ip 
 * @param mint 
 * @param processingDuration 
 * @param referenceId 
 * @param referenceType 
 * @param signature 
 * @param solanaCommitted 
 * @param solanaCommittedDuration 
 * @param solanaFinalized 
 * @param solanaFinalizedDuration 
 * @param solanaStart 
 * @param solanaTransaction 
 * @param source 
 * @param status 
 * @param totalDuration 
 * @param ua 
 * @param webhookEventStart 
 * @param webhookEventEnd 
 * @param webhookEventDuration 
 * @param webhookVerifyStart 
 * @param webhookVerifyEnd 
 * @param webhookVerifyDuration 
 */

data class Transaction (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,

    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null,

    @Json(name = "amount")
    val amount: kotlin.String? = null,

    @Json(name = "decimals")
    val decimals: java.math.BigDecimal? = null,

    @Json(name = "destination")
    val destination: kotlin.String? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<TransactionError>? = null,

    @Json(name = "explorerUrl")
    val explorerUrl: kotlin.String? = null,

    @Json(name = "feePayer")
    val feePayer: kotlin.String? = null,

    @Json(name = "ip")
    val ip: kotlin.String? = null,

    @Json(name = "mint")
    val mint: kotlin.String? = null,

    @Json(name = "processingDuration")
    val processingDuration: java.math.BigDecimal? = null,

    @Json(name = "referenceId")
    val referenceId: kotlin.String? = null,

    @Json(name = "referenceType")
    val referenceType: kotlin.String? = null,

    @Json(name = "signature")
    val signature: kotlin.String? = null,

    @Json(name = "solanaCommitted")
    val solanaCommitted: java.time.OffsetDateTime? = null,

    @Json(name = "solanaCommittedDuration")
    val solanaCommittedDuration: java.math.BigDecimal? = null,

    @Json(name = "solanaFinalized")
    val solanaFinalized: java.time.OffsetDateTime? = null,

    @Json(name = "solanaFinalizedDuration")
    val solanaFinalizedDuration: java.math.BigDecimal? = null,

    @Json(name = "solanaStart")
    val solanaStart: java.time.OffsetDateTime? = null,

    @Json(name = "solanaTransaction")
    val solanaTransaction: kotlin.Any? = null,

    @Json(name = "source")
    val source: kotlin.String? = null,

    @Json(name = "status")
    val status: Transaction.Status? = null,

    @Json(name = "totalDuration")
    val totalDuration: java.math.BigDecimal? = null,

    @Json(name = "ua")
    val ua: kotlin.String? = null,

    @Json(name = "webhookEventStart")
    val webhookEventStart: java.time.OffsetDateTime? = null,

    @Json(name = "webhookEventEnd")
    val webhookEventEnd: java.time.OffsetDateTime? = null,

    @Json(name = "webhookEventDuration")
    val webhookEventDuration: java.math.BigDecimal? = null,

    @Json(name = "webhookVerifyStart")
    val webhookVerifyStart: java.time.OffsetDateTime? = null,

    @Json(name = "webhookVerifyEnd")
    val webhookVerifyEnd: java.time.OffsetDateTime? = null,

    @Json(name = "webhookVerifyDuration")
    val webhookVerifyDuration: java.math.BigDecimal? = null

) {

    /**
     * 
     *
     * Values: committed,confirmed,failed,finalized,processing
     */
    enum class Status(val value: kotlin.String) {
        @Json(name = "Committed") committed("Committed"),
        @Json(name = "Confirmed") confirmed("Confirmed"),
        @Json(name = "Failed") failed("Failed"),
        @Json(name = "Finalized") finalized("Finalized"),
        @Json(name = "Processing") processing("Processing");
    }
}
