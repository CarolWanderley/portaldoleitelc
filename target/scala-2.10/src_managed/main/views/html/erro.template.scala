
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
object erro extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Disciplina],play.api.templates.HtmlFormat.Appendable] {

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
				<div>
					<hr class="uk-article-divider-orange">
				</div>
				<div class="center">
					<a href="/"><img alt="Portal Do Leite" src=""""),_display_(Seq[Any](/*22.51*/routes/*22.57*/.Assets.at("images/logo.png"))),format.raw/*22.86*/(""""></a>
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
							"""),_display_(Seq[Any](/*37.9*/for(disciplina <- disciplinas) yield /*37.39*/{_display_(Seq[Any](format.raw/*37.40*/("""
           						<li class="uk-nav-header"><a href="/disciplina/"""),_display_(Seq[Any](/*38.66*/disciplina/*38.76*/.getId())),format.raw/*38.84*/("""">"""),_display_(Seq[Any](/*38.87*/disciplina/*38.97*/.getNome())),format.raw/*38.107*/("""</a></li>
            					"""),_display_(Seq[Any](/*39.19*/for(tema <- disciplina.getTemas()) yield /*39.53*/{_display_(Seq[Any](format.raw/*39.54*/("""
           							<li class="uk-parent"><a href="/tema/"""),_display_(Seq[Any](/*40.57*/tema/*40.61*/.getId())),format.raw/*40.69*/("""">"""),_display_(Seq[Any](/*40.72*/tema/*40.76*/.getName())),format.raw/*40.86*/("""</a></li>
								""")))})),format.raw/*41.10*/("""
								<li class="uk-divider"></li>
							""")))})),format.raw/*43.9*/("""
            			</ul>
            		</div>
            	</div>
            	<!-- ---------------- MAIN CONTENT ---------------- -->
            	<div class="uk-width-medium-3-4">
            		<div class="uk-panel uk-panel-box">
            			<div class="uk-article">
	            				<h1>ERRO 404 - Página não encontrada</h1>
            				<div>
	            			</div>
            				<hr class="uk-article-divider-orange">
            			</div>
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
                    DATE: Wed Nov 25 23:27:35 GMT-03:00 2015
                    SOURCE: C:/Users/Carol/workspace/portaldoleitelc/app/views/erro.scala.html
                    HASH: c8e22560666297d8753fdf2fffc8d83bbf4602c7
                    MATRIX: 783->1|908->32|1145->234|1159->240|1214->274|1307->331|1322->337|1394->386|1492->448|1507->454|1561->486|1719->608|1734->614|1790->648|2137->959|2152->965|2203->994|2822->1578|2868->1608|2907->1609|3010->1676|3029->1686|3059->1694|3098->1697|3117->1707|3150->1717|3215->1746|3265->1780|3304->1781|3398->1839|3411->1843|3441->1851|3480->1854|3493->1858|3525->1868|3577->1888|3656->1936
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|50->22|50->22|50->22|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|69->41|71->43
                    -- GENERATED --
                */
            