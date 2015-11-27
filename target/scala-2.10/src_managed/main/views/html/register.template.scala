
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main("Register Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

   <div class="col-sm-4 col-sm-offset-4">
   """),_display_(Seq[Any](/*6.5*/if(flash.contains("fail"))/*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
   		<p class="bg-danger" style="">
        	"""),_display_(Seq[Any](/*8.11*/flash/*8.16*/.get("fail"))),format.raw/*8.28*/("""
		</p>
   """)))})),format.raw/*10.5*/("""

   """),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(routes.Register.register)/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
	   <h1 class="text-center">Registrar</h1>
	
	   <p>
	       <input type="text" name="login" placeholder="Login" ng-model="login" class="form-control" required>
	   </p>
	   <p>
	       <input type="text" name="nome" placeholder="Nome" ng-model="nome" value='"""),_display_(Seq[Any](/*19.83*/form("nome")/*19.95*/.value)),format.raw/*19.101*/("""'
                class="form-control" required>
	   </p>
	   <p>
	       <input type="email" name="email" placeholder="Email" ng-model="email" value='"""),_display_(Seq[Any](/*23.87*/form("email")/*23.100*/.value)),format.raw/*23.106*/("""'
                   class="form-control" required>
	   </p>
	   <p>
	       <input type="password" name="pass" placeholder="Password" ng-model="password" class="form-control" required>
	   </p>
	   <div>
	       <button class="btn btn-primary" type="submit" ng-disabled="!nome || !login || !email || !password">Registrar</button>
	       <a class="btn btn-info" style="float:right;" href="/login"> Login</a>
	   </div>
	""")))})),format.raw/*33.3*/("""
    </div>
""")))})),format.raw/*35.2*/("""
"""))}
    }
    
    def render(form:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 27 00:29:36 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master22/portaldoleite-master/app/views/register.scala.html
                    HASH: e2fecc05c1b09e9470b7059c5d3c3619afa95b66
                    MATRIX: 781->1|893->19|930->22|959->43|998->45|1080->93|1114->119|1153->121|1235->168|1248->173|1281->185|1324->197|1365->203|1380->209|1420->240|1460->242|1757->503|1778->515|1807->521|1995->673|2018->686|2047->692|2500->1114|2544->1127
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|36->8|36->8|38->10|40->12|40->12|40->12|40->12|47->19|47->19|47->19|51->23|51->23|51->23|61->33|63->35
                    -- GENERATED --
                */
            