package json

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

object User extends Controller {
  val jsonString =
    """
      |{
      |    "data": {
      |        "id": "1574083",
      |        "username": "snoopdogg",
      |        "full_name": "Snoop Dogg",
      |        "profile_picture": "http://distillery.s3.amazonaws.com/profiles/profile_1574083_75sq_1295469061.jpg",
      |        "bio": "This is my bio",
      |        "website": "http://snoopdogg.com",
      |        "counts": {
      |            "media": 1320,
      |            "follows": 420,
      |            "followed_by": 3410
      |        }
      |    }
      |}
    """.stripMargin

  def getUser(s: String) = Action {
    Ok(
      Json.parse(
        jsonString
      )
    )
  }

  def getUsers(s: String) = Action {
    val jsonArrayString = List.fill(10)(jsonString).mkString("[", ",", "]")

    Ok(
      Json.parse(
        jsonArrayString
      )
    )
  }

  def getUsersDatabase = Action {
    Ok(
      Json.parse(
        scala.io.Source.fromFile("/Users/anton/Development/Code/api-gateway/app/gallery/user-database").getLines().mkString
      )
    )
  }

}
