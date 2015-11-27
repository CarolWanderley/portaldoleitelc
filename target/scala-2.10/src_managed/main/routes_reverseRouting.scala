// @SOURCE:C:/Users/Carol/workspace/portaldoleitelc/conf/routes
// @HASH:8863286a8769432baa292f4d95b6fe45d93939fb
// @DATE:Fri Nov 27 01:03:50 GMT-03:00 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
// @LINE:15
class ReverseRegister {
    

// @LINE:15
def show(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registrar")
}
                                                

// @LINE:16
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registrar")
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:8
class ReverseLogin {
    

// @LINE:11
def show(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:12
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:37
class ReverseAssets {
    

// @LINE:37
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:21
def metadica(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "metadica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:34
def denunciarMetaDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "denunciarMetaDica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:7
def atualizaIndex(tipo:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "atualizaIndex/" + implicitly[PathBindable[Integer]].unbind("tipo", tipo))
}
                                                

// @LINE:27
def upVoteDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upVoteDica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:23
def cadastrarDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cadastrarDica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:31
def cadastrarMetaDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cadastrarMetaDica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:24
def setSortType(idTipoSort:Int, idTema:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "setSortType/" + implicitly[PathBindable[Int]].unbind("idTipoSort", idTipoSort) + "/" + implicitly[PathBindable[Long]].unbind("idTema", idTema))
}
                                                

// @LINE:26
def addDiscordanciaEmDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addDiscordancia/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:28
def upVoteMetaDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upVoteMetaDica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:33
def denunciarDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "denunciarDica/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:29
def addDiscordanciaEmMetaDica(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addDiscordanciaMeta/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:20
def disciplina(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "disciplina/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:25
def avaliarDificuldadeTema(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "avaliar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:19
def tema(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tema/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          
}
                  


// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:16
// @LINE:15
class ReverseRegister {
    

// @LINE:15
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registrar"})
      }
   """
)
                        

// @LINE:16
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Register.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registrar"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:8
class ReverseLogin {
    

// @LINE:11
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Login.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:37
class ReverseAssets {
    

// @LINE:37
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:21
def metadica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.metadica",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "metadica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def denunciarMetaDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.denunciarMetaDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "denunciarMetaDica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:7
def atualizaIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.atualizaIndex",
   """
      function(tipo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "atualizaIndex/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("tipo", tipo)})
      }
   """
)
                        

// @LINE:27
def upVoteDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upVoteDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upVoteDica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def cadastrarDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cadastrarDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrarDica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def cadastrarMetaDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cadastrarMetaDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrarMetaDica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:24
def setSortType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.setSortType",
   """
      function(idTipoSort,idTema) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "setSortType/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idTipoSort", idTipoSort) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idTema", idTema)})
      }
   """
)
                        

// @LINE:26
def addDiscordanciaEmDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addDiscordanciaEmDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDiscordancia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:28
def upVoteMetaDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upVoteMetaDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upVoteMetaDica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:33
def denunciarDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.denunciarDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "denunciarDica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def addDiscordanciaEmMetaDica : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addDiscordanciaEmMetaDica",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addDiscordanciaMeta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def disciplina : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.disciplina",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "disciplina/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def avaliarDificuldadeTema : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.avaliarDificuldadeTema",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "avaliar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:19
def tema : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tema",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tema/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
// @LINE:15
class ReverseRegister {
    

// @LINE:15
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.show(), HandlerDef(this, "controllers.Register", "show", Seq(), "GET", """ Register""", _prefix + """registrar""")
)
                      

// @LINE:16
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Register.register(), HandlerDef(this, "controllers.Register", "register", Seq(), "POST", """""", _prefix + """registrar""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:8
class ReverseLogin {
    

// @LINE:11
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.show(), HandlerDef(this, "controllers.Login", "show", Seq(), "GET", """ Login""", _prefix + """login""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.logout(), HandlerDef(this, "controllers.Login", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:12
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Login.authenticate(), HandlerDef(this, "controllers.Login", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:37
class ReverseAssets {
    

// @LINE:37
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:21
def metadica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.metadica(id), HandlerDef(this, "controllers.Application", "metadica", Seq(classOf[Long]), "GET", """""", _prefix + """metadica/$id<[^/]+>""")
)
                      

// @LINE:34
def denunciarMetaDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.denunciarMetaDica(id), HandlerDef(this, "controllers.Application", "denunciarMetaDica", Seq(classOf[Long]), "POST", """""", _prefix + """denunciarMetaDica/$id<[^/]+>""")
)
                      

// @LINE:7
def atualizaIndex(tipo:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.atualizaIndex(tipo), HandlerDef(this, "controllers.Application", "atualizaIndex", Seq(classOf[Integer]), "GET", """""", _prefix + """atualizaIndex/$tipo<[^/]+>""")
)
                      

// @LINE:27
def upVoteDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upVoteDica(id), HandlerDef(this, "controllers.Application", "upVoteDica", Seq(classOf[Long]), "POST", """""", _prefix + """upVoteDica/$id<[^/]+>""")
)
                      

// @LINE:23
def cadastrarDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cadastrarDica(id), HandlerDef(this, "controllers.Application", "cadastrarDica", Seq(classOf[Long]), "POST", """""", _prefix + """cadastrarDica/$id<[^/]+>""")
)
                      

// @LINE:31
def cadastrarMetaDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cadastrarMetaDica(id), HandlerDef(this, "controllers.Application", "cadastrarMetaDica", Seq(classOf[Long]), "POST", """""", _prefix + """cadastrarMetaDica/$id<[^/]+>""")
)
                      

// @LINE:24
def setSortType(idTipoSort:Int, idTema:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.setSortType(idTipoSort, idTema), HandlerDef(this, "controllers.Application", "setSortType", Seq(classOf[Int], classOf[Long]), "GET", """""", _prefix + """setSortType/$idTipoSort<[^/]+>/$idTema<[^/]+>""")
)
                      

// @LINE:26
def addDiscordanciaEmDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addDiscordanciaEmDica(id), HandlerDef(this, "controllers.Application", "addDiscordanciaEmDica", Seq(classOf[Long]), "POST", """""", _prefix + """addDiscordancia/$id<[^/]+>""")
)
                      

// @LINE:28
def upVoteMetaDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upVoteMetaDica(id), HandlerDef(this, "controllers.Application", "upVoteMetaDica", Seq(classOf[Long]), "POST", """""", _prefix + """upVoteMetaDica/$id<[^/]+>""")
)
                      

// @LINE:33
def denunciarDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.denunciarDica(id), HandlerDef(this, "controllers.Application", "denunciarDica", Seq(classOf[Long]), "POST", """""", _prefix + """denunciarDica/$id<[^/]+>""")
)
                      

// @LINE:29
def addDiscordanciaEmMetaDica(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addDiscordanciaEmMetaDica(id), HandlerDef(this, "controllers.Application", "addDiscordanciaEmMetaDica", Seq(classOf[Long]), "POST", """""", _prefix + """addDiscordanciaMeta/$id<[^/]+>""")
)
                      

// @LINE:20
def disciplina(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.disciplina(id), HandlerDef(this, "controllers.Application", "disciplina", Seq(classOf[Long]), "GET", """""", _prefix + """disciplina/$id<[^/]+>""")
)
                      

// @LINE:25
def avaliarDificuldadeTema(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.avaliarDificuldadeTema(id), HandlerDef(this, "controllers.Application", "avaliarDificuldadeTema", Seq(classOf[Long]), "POST", """""", _prefix + """avaliar/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:19
def tema(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tema(id), HandlerDef(this, "controllers.Application", "tema", Seq(classOf[Long]), "GET", """ Main""", _prefix + """tema/$id<[^/]+>""")
)
                      
    
}
                          
}
        
    