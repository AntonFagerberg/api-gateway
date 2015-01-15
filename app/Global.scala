import play.api._
import play.api.mvc._
import play.filters.gzip.GzipFilter

object Global extends
WithFilters(new GzipFilter()) with
GlobalSettings {

  override def onRouteRequest(request: RequestHeader): Option[Handler] = {
//    println("executed before every request:" + request.toString)
    super.onRouteRequest(request)
  }

}