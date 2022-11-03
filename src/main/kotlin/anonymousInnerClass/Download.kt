package anonymousInnerClass

import InterFaces.Download

interface Download
{
  fun DownloadStarted()
  fun DownloadCompleted(file:String)
  fun DownloadUpdated(progress:Int)
}