package com.eduardosmolareki.ProjFinalCalculate.dao

import com.eduardosmolareki.ProjFinalCalculate.model.Result
import com.j256.ormlite.dao.BaseDaoImpl
import com.j256.ormlite.support.ConnectionSource

class ResultDAO(connectionSource: ConnectionSource?) : BaseDaoImpl<Result, Int> (Result::class.java) {
    init {
        setConnectionSource(connectionSource)
        initialize()
    }
}