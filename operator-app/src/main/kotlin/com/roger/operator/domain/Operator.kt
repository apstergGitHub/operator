package com.roger.operator.domain

import com.expediagroup.graphql.federation.directives.ExtendsDirective
import com.expediagroup.graphql.federation.directives.ExternalDirective
import com.expediagroup.graphql.federation.directives.FieldSet
import com.expediagroup.graphql.federation.directives.KeyDirective

@KeyDirective(fields = FieldSet("code"))
data class Operator(
    val code: String,
    val name: String,
    val customerType: String,
    val careLevel: CareLevel,
    val features: List<Feature>
)

@KeyDirective(fields = FieldSet("code"))
@ExtendsDirective
data class Service(
    @property:ExternalDirective val code: String,
    val operator: Operator
)