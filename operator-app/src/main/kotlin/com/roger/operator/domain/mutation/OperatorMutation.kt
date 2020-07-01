package com.roger.operator.domain.mutation

import com.expediagroup.graphql.spring.operations.Mutation
import com.roger.operator.dao.OperatorDao
import com.roger.operator.domain.CareLevel
import com.roger.operator.domain.Feature
import com.roger.operator.domain.Operator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class OperatorMutation(@Autowired private val operatorDao: OperatorDao) : Mutation {
    fun operator(input: OperatorInput): Operator = operatorDao.update(input)
}

data class OperatorInput(
    val code: String,
    val name: String?,
    val customerType: String?,
    val careLevel: CareLevel?,
    val features: List<Feature>?
)