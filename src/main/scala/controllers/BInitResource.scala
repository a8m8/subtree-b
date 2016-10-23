package controllers

import play.api.mvc.{Action, Controller}

class BInitResource extends Controller{

  def index = Action { request =>
    Ok("Hello from subtree-b")
  }

}
