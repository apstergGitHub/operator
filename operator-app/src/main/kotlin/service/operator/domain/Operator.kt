package service.operator.domain

data class Operator(
    val code: String,
    val name: String,
    val customerType: String,
    val careLevel: CareLevel,
    val features: List<Feature>
)