package ru.ladgertha.workmanagersstepik.workers

import android.content.Context
import android.util.Log
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters

class SimpleWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {
        Log.d("SimpleWorker", "Работа выполнена успешно!")
        return Result.success()
    }

    companion object {

        fun start(context: Context) {
            val simpleWorkRequest = OneTimeWorkRequestBuilder<SimpleWorker>().build()
            WorkManager.getInstance(context).enqueue(simpleWorkRequest)
        }
    }
}