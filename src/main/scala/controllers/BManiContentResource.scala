package controllers

import play.api.mvc.{Action, Controller}

class BManiContentResource extends Controller{

  def showMainContent = Action { request =>
    Ok(views.html.content())
  }

}
