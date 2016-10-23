package controllers

import play.api.http.LazyHttpErrorHandler

object HubAssets extends controllers.AssetsBuilder(LazyHttpErrorHandler)
