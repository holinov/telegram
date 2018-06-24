package info.mukel.telegrambot4s.models

sealed trait AkkaInputFile extends InputFile

object AkkaInputFile {
  private [telegrambot4s] final case class ByteString(filename: String, contents: akka.util.ByteString) extends AkkaInputFile
  def apply(filename: String, contents: akka.util.ByteString): AkkaInputFile = ByteString(filename, contents)
}