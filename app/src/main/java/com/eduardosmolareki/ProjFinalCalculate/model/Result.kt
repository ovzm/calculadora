package com.eduardosmolareki.ProjFinalCalculate.model

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = "results")
data class Result(
    @DatabaseField(generatedId = true)
    val id:Int = 0,
    @DatabaseField
    val result:String = "",
    @DatabaseField
    val count:String = ""
)
