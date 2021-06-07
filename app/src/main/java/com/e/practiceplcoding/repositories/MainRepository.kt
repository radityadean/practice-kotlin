package com.e.practiceplcoding.repositories

import com.e.practiceplcoding.db.Run
import com.e.practiceplcoding.db.RunDAO
import javax.inject.Inject


class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunningSortByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunningSortByDistanceInMeters()

    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunningSortByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunningSortByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunningSortBycaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getAvgSpeedInKMH()

    fun getTotalDistance() = runDAO.getTotalDistanceInMeters()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalTimeInMillies() = runDAO.getTotalTimeInMillis()


}