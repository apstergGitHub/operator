package com.roger.operator.dao

import com.roger.operator.domain.CareLevel
import com.roger.operator.domain.Feature
import com.roger.operator.domain.Operator
import com.roger.operator.domain.mutation.OperatorInput

class OperatorDao {
    private val operators: MutableMap<String, Operator> = mutableMapOf(
        "apostolos" to Operator(
            "apostolos",
            "Greek Freak",
            "Residential",
            CareLevel(1),
            listOf(
                Feature("IPV6"),
                Feature("CallForward")
            )
        ),
        "ferhat" to Operator(
            "ferhat",
            "Turkish Freak",
            "Business",
            CareLevel(3),
            listOf(Feature("IPV6"))
        ),
        "tom" to Operator(
            "tom", "British Freak", "All",
            CareLevel(4), listOf(
                Feature("IPV6"),
                Feature("Advanced")
            )
        )
    )

    fun get(operatorCode: String): Operator = operators.getValue(operatorCode)

    fun update(input: OperatorInput): Operator {
        return operators.compute(input.code) { _, oldValue ->
            oldValue?.let {
                Operator(
                    input.code,
                    input.name ?: it.name,
                    input.customerType ?: it.customerType,
                    input.careLevel ?: it.careLevel,
                    input.features ?: it.features
                )
            } ?: input.transform()
        }!!

    }

    private fun OperatorInput.transform(): Operator = Operator(code, name!!, customerType!!, careLevel!!, features!!)
}