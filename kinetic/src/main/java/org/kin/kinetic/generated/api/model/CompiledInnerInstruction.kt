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

package org.kin.kinetic.generated.api.model

import org.kin.kinetic.generated.api.model.CompiledInstruction

import com.squareup.moshi.Json

/**
 * 
 *
 * @param index 
 * @param instructions 
 */

data class CompiledInnerInstruction (

    @Json(name = "index")
    val index: kotlin.Int,

    @Json(name = "instructions")
    val instructions: kotlin.collections.List<CompiledInstruction>

)

