package com.eduardosmolareki.ProjFinalCalculate.repository

import android.content.Context
import com.eduardosmolareki.ProjFinalCalculate.dao.DataBaseHelper
import com.eduardosmolareki.ProjFinalCalculate.dao.ResultDAO
import com.eduardosmolareki.ProjFinalCalculate.model.Result

class ResultRepository(context: Context) {
    private val dbHelper = DataBaseHelper(context)
    private val dao = ResultDAO(dbHelper.connectionSource)

    fun insert(result: Result):Int {
        val result = dao.create(result)
        dao.connectionSource.close()
        return result
    }

    fun findAll() = dao.queryForAll()
}