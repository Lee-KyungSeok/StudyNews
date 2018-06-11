package co.kr.studynews.data


interface BaseEntityMapper<DataModel, Entity> {
    fun toEntity(dataModel: DataModel): Entity
    fun fromEntity(entity: Entity): DataModel
}