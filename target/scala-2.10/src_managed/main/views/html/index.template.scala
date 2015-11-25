
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Disciplina],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(disciplinas: List[Disciplina]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Tema</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/portalDoLeite_uikit.css"))),format.raw/*10.109*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src="https://code.jquery.com/jquery-2.1.3.js" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/uikit.js"))),format.raw/*13.63*/("""" type="text/javascript"></script>
    </head>
    <body ng-app="">
        <div class="uk-container uk-container-center">
    		<div id="topo" class="uk-panel">
				<div class="uk-text-right">
					<a>Bem-vindo(a), """),_display_(Seq[Any](/*19.24*/session/*19.31*/.get("username"))),format.raw/*19.47*/("""</a> | <a href="/logout">Logout</a>
					<hr class="uk-article-divider-orange">
				</div>
				<div class="center">
					<a href="/"><img alt="Portal Do Leite" src=""""),_display_(Seq[Any](/*23.51*/routes/*23.57*/.Assets.at("images/logo.png"))),format.raw/*23.86*/(""""></a>
					<hr class="uk-article-divider">
					<hr class="uk-article-divider-orange">
					<hr class="uk-article-divider-green">
				</div>
    		</div>
            <div class="uk-grid" data-uk-grid-margin>
            	<!-- ---------------- MENU ---------------- -->
            	<div class="uk-width-medium-1-4">
            		<div class="uk-panel uk-panel-box">
            			<div class="uk-panel-header">
            				<h3 class="uk-panel-title">Menu</h3>
            			</div>
						<ul class="uk-nav uk-nav-side">
							<li class="uk-divider"></li>
							"""),_display_(Seq[Any](/*38.9*/for(disciplina <- disciplinas) yield /*38.39*/{_display_(Seq[Any](format.raw/*38.40*/("""
           						<li class="uk-nav-header"><a href="/disciplina/"""),_display_(Seq[Any](/*39.66*/disciplina/*39.76*/.getId())),format.raw/*39.84*/("""">"""),_display_(Seq[Any](/*39.87*/disciplina/*39.97*/.getNome())),format.raw/*39.107*/("""</a></li>
            					"""),_display_(Seq[Any](/*40.19*/for(tema <- disciplina.getTemas()) yield /*40.53*/{_display_(Seq[Any](format.raw/*40.54*/("""
           							<li class="uk-parent"><a href="/tema/"""),_display_(Seq[Any](/*41.57*/tema/*41.61*/.getId())),format.raw/*41.69*/("""">"""),_display_(Seq[Any](/*41.72*/tema/*41.76*/.getName())),format.raw/*41.86*/("""</a></li>
								""")))})),format.raw/*42.10*/("""
								<li class="uk-divider"></li>
							""")))})),format.raw/*44.9*/("""
            			</ul>
            		</div>
            	</div>
            	<!-- ---------------- MAIN CONTENT ---------------- -->
            	<div class="uk-width-medium-3-4">
            		<div class="uk-panel uk-panel-box">
            			<div class="uk-article">
	            				<h1>Bem-vindo(a) ao Portal do Leite!</h1>
            				<div>
	            			</div>
            				<hr class="uk-article-divider-orange">
            			</div>
            			<p>Escolha uma disciplina ou tema ao lado para acessar os leites.</p>
            		</div>
            	</div>
            </div>
        </div>
    </body>
</html>
"""))}
    }
    
    def render(disciplinas:List[Disciplina]): play.api.templates.HtmlFormat.Appendable = apply(disciplinas)
    
    def f:((List[Disciplina]) => play.api.templates.HtmlFormat.Appendable) = (disciplinas) => apply(disciplinas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 24 09:38:37 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master/app/views/index.scala.html
                    HASH: 7e78c58484f3a9b284e52146ec0973fcfe20259f
                    MATRIX: 784->1|909->32|1138->226|1152->232|1207->266|1299->322|1314->328|1386->377|1483->438|1498->444|1552->476|1708->596|1723->602|1779->636|2032->853|2048->860|2086->876|2288->1042|2303->1048|2354->1077|2958->1646|3004->1676|3043->1677|3145->1743|3164->1753|3194->1761|3233->1764|3252->1774|3285->1784|3349->1812|3399->1846|3438->1847|3531->1904|3544->1908|3574->1916|3613->1919|3626->1923|3658->1933|3709->1952|3786->1998
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|51->23|51->23|51->23|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44
                    -- GENERATED --
                */
            