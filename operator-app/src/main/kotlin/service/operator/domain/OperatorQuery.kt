package service.operator.domain

import com.expediagroup.graphql.SchemaGeneratorConfig
import com.expediagroup.graphql.TopLevelObject
import com.expediagroup.graphql.spring.operations.Query
import com.expediagroup.graphql.toSchema
import org.springframework.stereotype.Component

private val operators = mapOf(
    "apostolos" to Operator(
        "apostolos",
        "Greek Freak",
        "Residential",
        CareLevel(1),
        listOf(Feature("IPV6"), Feature("CallForward"))
    ),
    "ferhat" to Operator("ferhat", "Turkish Freak", "Business", CareLevel(3), listOf(Feature("IPV6"))),
    "tom" to Operator("tom", "British Freak", "All", CareLevel(4), listOf(Feature("IPV6"), Feature("Advanced")))
)

@Component
class OperatorQuery : Query {
    fun operator(code: String): Operator {
        return operators.getValue(code)
    }
}

// Generate the schema
val config = SchemaGeneratorConfig(supportedPackages = listOf("service.operator.domain"))
val queries = listOf(TopLevelObject(OperatorQuery()))
val schema = toSchema(config, queries)