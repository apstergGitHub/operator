package com.roger.operator.config

import com.roger.operator.dao.OperatorDao
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class DaoConfig {

    @Bean
    open fun operatorDao() = OperatorDao()
}