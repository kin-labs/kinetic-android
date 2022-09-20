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

import org.openapitools.client.models.ConfirmedTransactionMeta
import org.openapitools.client.models.TransactionData

import com.squareup.moshi.Json

/**
 * 
 *
 * @param transaction 
 * @param meta 
 * @param slot 
 * @param blockTime 
 */

data class TransactionResponse (

    @Json(name = "transaction")
    val transaction: TransactionData,

    @Json(name = "meta")
    val meta: ConfirmedTransactionMeta,

    @Json(name = "slot")
    val slot: java.math.BigDecimal? = null,

    @Json(name = "blockTime")
    val blockTime: java.math.BigDecimal? = null

)
