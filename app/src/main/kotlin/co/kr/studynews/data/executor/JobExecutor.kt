package co.kr.studynews.data.executor

import co.kr.studynews.domain.executer.ThreadExecutor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

class JobExecutor(
        val threadPoolExecutor: ThreadPoolExecutor
        = ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS,
                LinkedBlockingQueue<Runnable>(), JobThreadFactory())
) : ThreadExecutor {
    override fun execute(command: Runnable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private class JobThreadFactory : ThreadFactory {
        private var counter = 0

        override fun newThread(runnable: Runnable): Thread {
            return Thread(runnable, "android_" + counter++)
        }
    }
}