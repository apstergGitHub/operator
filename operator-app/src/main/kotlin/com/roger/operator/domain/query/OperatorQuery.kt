package com.roger.operator.domain.query

import com.expediagroup.graphql.spring.operations.Query
import com.roger.operator.dao.OperatorDao
import com.roger.operator.domain.Operator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class OperatorQuery(@Autowired private val operatorDao: OperatorDao = OperatorDao()) : Query {
    fun operator(code: String): Operator = operatorDao.get(code)
}

