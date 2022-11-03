package anonymousInnerClass

class DownloadListener
{
   var downloadListner:Download ?=null  //refernce variable..
    fun downloadFile(file:String){
        downloadListner?.DownloadStarted()
        for (i in 1..10)
        {
            Thread.sleep(3000)
            downloadListner?.DownloadUpdated(i*10)
        }
        downloadListner?.DownloadCompleted(file)
    }
}