package com.roger.operator.config

import com.roger.operator.dao.OperatorDao
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class DaoConfig {

    @Bean
    fun operatorDao() = OperatorDao()
}