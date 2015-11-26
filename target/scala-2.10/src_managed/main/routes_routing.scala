// @SOURCE:C:/Users/Luiza/Documents/portaldoleite-master22/portaldoleite-master/conf/routes
// @HASH:8863286a8769432baa292f4d95b6fe45d93939fb
// @DATE:Thu Nov 26 20:59:00 BRST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_atualizaIndex1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("atualizaIndex/"),DynamicPart("tipo", """[^/]+""",true))))
        

// @LINE:8
private[this] lazy val controllers_Login_logout2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:11
private[this] lazy val controllers_Login_show3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Login_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:15
private[this] lazy val controllers_Register_show5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrar"))))
        

// @LINE:16
private[this] lazy val controllers_Register_register6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registrar"))))
        

// @LINE:19
private[this] lazy val controllers_Application_tema7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tema/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_Application_disciplina8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("disciplina/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Application_metadica9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("metadica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Application_cadastrarDica10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastrarDica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Application_setSortType11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("setSortType/"),DynamicPart("idTipoSort", """[^/]+""",true),StaticPart("/"),DynamicPart("idTema", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Application_avaliarDificuldadeTema12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("avaliar/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Application_addDiscordanciaEmDica13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addDiscordancia/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_Application_upVoteDica14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upVoteDica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Application_upVoteMetaDica15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upVoteMetaDica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Application_addDiscordanciaEmMetaDica16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addDiscordanciaMeta/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_Application_cadastrarMetaDica17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastrarMetaDica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:33
private[this] lazy val controllers_Application_denunciarDica18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("denunciarDica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:34
private[this] lazy val controllers_Application_denunciarMetaDica19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("denunciarMetaDica/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """atualizaIndex/$tipo<[^/]+>""","""controllers.Application.atualizaIndex(tipo:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Login.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Login.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrar""","""controllers.Register.show()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registrar""","""controllers.Register.register()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tema/$id<[^/]+>""","""controllers.Application.tema(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """disciplina/$id<[^/]+>""","""controllers.Application.disciplina(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """metadica/$id<[^/]+>""","""controllers.Application.metadica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastrarDica/$id<[^/]+>""","""controllers.Application.cadastrarDica(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """setSortType/$idTipoSort<[^/]+>/$idTema<[^/]+>""","""controllers.Application.setSortType(idTipoSort:Int, idTema:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """avaliar/$id<[^/]+>""","""controllers.Application.avaliarDificuldadeTema(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addDiscordancia/$id<[^/]+>""","""controllers.Application.addDiscordanciaEmDica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upVoteDica/$id<[^/]+>""","""controllers.Application.upVoteDica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upVoteMetaDica/$id<[^/]+>""","""controllers.Application.upVoteMetaDica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addDiscordanciaMeta/$id<[^/]+>""","""controllers.Application.addDiscordanciaEmMetaDica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastrarMetaDica/$id<[^/]+>""","""controllers.Application.cadastrarMetaDica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """denunciarDica/$id<[^/]+>""","""controllers.Application.denunciarDica(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """denunciarMetaDica/$id<[^/]+>""","""controllers.Application.denunciarMetaDica(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_atualizaIndex1(params) => {
   call(params.fromPath[Integer]("tipo", None)) { (tipo) =>
        invokeHandler(controllers.Application.atualizaIndex(tipo), HandlerDef(this, "controllers.Application", "atualizaIndex", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """atualizaIndex/$tipo<[^/]+>"""))
   }
}
        

// @LINE:8
case controllers_Login_logout2(params) => {
   call { 
        invokeHandler(controllers.Login.logout(), HandlerDef(this, "controllers.Login", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:11
case controllers_Login_show3(params) => {
   call { 
        invokeHandler(controllers.Login.show(), HandlerDef(this, "controllers.Login", "show", Nil,"GET", """ Login""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Login_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Login.authenticate(), HandlerDef(this, "controllers.Login", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:15
case controllers_Register_show5(params) => {
   call { 
        invokeHandler(controllers.Register.show(), HandlerDef(this, "controllers.Register", "show", Nil,"GET", """ Register""", Routes.prefix + """registrar"""))
   }
}
        

// @LINE:16
case controllers_Register_register6(params) => {
   call { 
        invokeHandler(controllers.Register.register(), HandlerDef(this, "controllers.Register", "register", Nil,"POST", """""", Routes.prefix + """registrar"""))
   }
}
        

// @LINE:19
case controllers_Application_tema7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.tema(id), HandlerDef(this, "controllers.Application", "tema", Seq(classOf[Long]),"GET", """ Main""", Routes.prefix + """tema/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_Application_disciplina8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.disciplina(id), HandlerDef(this, "controllers.Application", "disciplina", Seq(classOf[Long]),"GET", """""", Routes.prefix + """disciplina/$id<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Application_metadica9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.metadica(id), HandlerDef(this, "controllers.Application", "metadica", Seq(classOf[Long]),"GET", """""", Routes.prefix + """metadica/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Application_cadastrarDica10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.cadastrarDica(id), HandlerDef(this, "controllers.Application", "cadastrarDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """cadastrarDica/$id<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Application_setSortType11(params) => {
   call(params.fromPath[Int]("idTipoSort", None), params.fromPath[Long]("idTema", None)) { (idTipoSort, idTema) =>
        invokeHandler(controllers.Application.setSortType(idTipoSort, idTema), HandlerDef(this, "controllers.Application", "setSortType", Seq(classOf[Int], classOf[Long]),"GET", """""", Routes.prefix + """setSortType/$idTipoSort<[^/]+>/$idTema<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Application_avaliarDificuldadeTema12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.avaliarDificuldadeTema(id), HandlerDef(this, "controllers.Application", "avaliarDificuldadeTema", Seq(classOf[Long]),"POST", """""", Routes.prefix + """avaliar/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Application_addDiscordanciaEmDica13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.addDiscordanciaEmDica(id), HandlerDef(this, "controllers.Application", "addDiscordanciaEmDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """addDiscordancia/$id<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_Application_upVoteDica14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.upVoteDica(id), HandlerDef(this, "controllers.Application", "upVoteDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """upVoteDica/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Application_upVoteMetaDica15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.upVoteMetaDica(id), HandlerDef(this, "controllers.Application", "upVoteMetaDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """upVoteMetaDica/$id<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Application_addDiscordanciaEmMetaDica16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.addDiscordanciaEmMetaDica(id), HandlerDef(this, "controllers.Application", "addDiscordanciaEmMetaDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """addDiscordanciaMeta/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_Application_cadastrarMetaDica17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.cadastrarMetaDica(id), HandlerDef(this, "controllers.Application", "cadastrarMetaDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """cadastrarMetaDica/$id<[^/]+>"""))
   }
}
        

// @LINE:33
case controllers_Application_denunciarDica18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.denunciarDica(id), HandlerDef(this, "controllers.Application", "denunciarDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """denunciarDica/$id<[^/]+>"""))
   }
}
        

// @LINE:34
case controllers_Application_denunciarMetaDica19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.denunciarMetaDica(id), HandlerDef(this, "controllers.Application", "denunciarMetaDica", Seq(classOf[Long]),"POST", """""", Routes.prefix + """denunciarMetaDica/$id<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     