import play.api._
import play.api.mvc._

object Global extends GlobalSettings {

  override def onRouteRequest(request: RequestHeader): Option[Handler] = {
//    println("executed before every request:" + request.toString)
    super.onRouteRequest(request)
  }

}