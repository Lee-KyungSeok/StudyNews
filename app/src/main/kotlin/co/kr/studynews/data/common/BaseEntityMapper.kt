package co.kr.studynews.data.common


interface BaseEntityMapper<DataModel, Entity> {
    fun toEntity(dataModel: DataModel): Entity
    fun fromEntity(entity: Entity): DataModel
}