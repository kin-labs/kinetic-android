/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Commitment

import com.squareup.moshi.Json

/**
 * 
 *
 * @param commitment 
 * @param environment 
 * @param index 
 * @param mint 
 * @param lastValidBlockHeight 
 * @param tx 
 * @param referenceId 
 * @param referenceType 
 */

data class MakeTransferRequest (

    @Json(name = "commitment")
    val commitment: Commitment,

    @Json(name = "environment")
    val environment: kotlin.String,

    @Json(name = "index")
    val index: kotlin.Int,

    @Json(name = "mint")
    val mint: kotlin.String,

    @Json(name = "lastValidBlockHeight")
    val lastValidBlockHeight: kotlin.Int,

    @Json(name = "tx")
    val tx: kotlin.String,

    @Json(name = "referenceId")
    val referenceId: kotlin.String? = null,

    @Json(name = "referenceType")
    val referenceType: kotlin.String? = null

)

