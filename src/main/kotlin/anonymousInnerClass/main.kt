package anonymousInnerClass

fun main()
{
 val downloadListners = DownloadListener()
    downloadListners.downloadListner = object :Download{
        override fun DownloadStarted() {
            println("Download Started...")
        }

        override fun DownloadCompleted(file: String) {
            println("$file downloaded...")
        }

        override fun DownloadUpdated(progress: Int) {
            println("$progress% download updated.. ")
        }

    }
    downloadListners.downloadFile("mp4.file")
}