
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Login Page")/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""
   <div>
   """),_display_(Seq[Any](/*3.5*/if(flash.contains("fail"))/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
   		<p class="bg-danger" style="">
        	"""),_display_(Seq[Any](/*5.11*/flash/*5.16*/.get("fail"))),format.raw/*5.28*/("""
		</p>
   """)))})),format.raw/*7.5*/("""
   
	<div class="uk-container center">
		<a href="/"><img alt="Portal Do Leite" src=""""),_display_(Seq[Any](/*10.48*/routes/*10.54*/.Assets.at("images/logo.png"))),format.raw/*10.83*/(""""></a>
		<div class="uk-panel-box"> 
			<form class="uk-form" method="post" action="/login">
				<div class="uk-panel-title"><h4>Bem-vindo(a) ao Portal Do Leite</h4></div>
				<div class="uk-form-row">
					<div class="uk-form-icon">
						<i class="uk-icon-user"></i>
						<input type="text" name="login" placeholder="Usuário" class="form-control">
					</div>
				</div>
				<div class="uk-form-row">
					<div class="uk-form-icon">
						<i class="uk-icon-key"></i>
						<input type="password" name="pass" placeholder="Senha">
					</div>
				</div>
				<div class="uk-form-row">
					<button class="uk-button uk-button-primary" type="submit">Login</button>
				</div>
			</form>
			</div>
		</div>
		<div class="center">
			<br><p>Ainda não possui um cadastro? <a data-uk-modal=""""),format.raw/*33.59*/("""{"""),format.raw/*33.60*/("""target:'#cadastro-modal'"""),format.raw/*33.84*/("""}"""),format.raw/*33.85*/("""">Cadastre-se</a> agora.</p>
		</div>
	</div>

	<div id="cadastro-modal" class="uk-modal">
		<div class="uk-modal-dialog">
			<a class="uk-modal-close uk-close"></a>
			<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Cadastro</h2></div>
			<div class="uk-container uk-container-center">
			<form class="uk-form center" method="post" action="/registrar">
				<div class="uk-form-row">
					<div class="uk-form-icon">
						<i class="uk-icon-user"></i>
						<input type="text" name="nome" placeholder="Nome" ng-model="nome"
							class="form-control" required>
					</div>
				</div>
				<div class="uk-form-row">
					<div class="uk-form-icon">
						<i class="uk-icon-envelope"></i>
						<input type="email" name="email" placeholder="Email" ng-model="email"
							class="form-control" required>
					</div>
				</div>
				<div class="uk-form-row">
					<div class="uk-form-icon">
						<i class="uk-icon-user-secret"></i>
						<input type="text" name="login" placeholder="Login" ng-model="login" class="form-control" required>
					</div>
				</div>
				<div class="uk-form-row">
					<div class="uk-form-icon">
						<i class="uk-icon-key"></i>
						<input type="password" name="pass" placeholder="Password" ng-model="password" class="form-control" required>
					</div>
				</div>
			</div>
			<div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
				<button class="uk-button uk-button-primary" type="submit" ng-disabled="!nome || !login || !email || !password">Registrar</button>
			</div>
			</form>
		</div>
	</div>
""")))})),format.raw/*76.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 24 09:38:37 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master/app/views/login.scala.html
                    HASH: a3d4b78d75ce043fa5c00e0df61d8c9417ad9639
                    MATRIX: 864->1|890->19|929->21|977->35|1011->61|1050->63|1132->110|1145->115|1178->127|1220->139|1343->226|1358->232|1409->261|2222->1046|2251->1047|2303->1071|2332->1072|3933->2642
                    LINES: 29->1|29->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|38->10|38->10|38->10|61->33|61->33|61->33|61->33|104->76
                    -- GENERATED --
                */
            