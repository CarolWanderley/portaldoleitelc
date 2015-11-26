
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Disciplina],List[Dica],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(disciplinas: List[Disciplina], dicas: List[Dica]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""

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
                    <a>Bem-vindo(a), """),_display_(Seq[Any](/*19.39*/session/*19.46*/.get("username"))),format.raw/*19.62*/("""</a> | <a href="/logout">Logout</a>
                    <hr class="uk-article-divider-orange">
                </div>
                <div class="center">
                    <a href="/"><img alt="Portal Do Leite" src=""""),_display_(Seq[Any](/*23.66*/routes/*23.72*/.Assets.at("images/logo.png"))),format.raw/*23.101*/(""""></a>
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
                            """),_display_(Seq[Any](/*38.30*/for(disciplina <- disciplinas) yield /*38.60*/{_display_(Seq[Any](format.raw/*38.61*/("""
                                <li class="uk-nav-header"><a href="/disciplina/"""),_display_(Seq[Any](/*39.81*/disciplina/*39.91*/.getId())),format.raw/*39.99*/("""">"""),_display_(Seq[Any](/*39.102*/disciplina/*39.112*/.getNome())),format.raw/*39.122*/("""</a></li>
                                """),_display_(Seq[Any](/*40.34*/for(tema <- disciplina.getTemas()) yield /*40.68*/{_display_(Seq[Any](format.raw/*40.69*/("""
                                    <li class="uk-parent"><a href="/tema/"""),_display_(Seq[Any](/*41.75*/tema/*41.79*/.getId())),format.raw/*41.87*/("""">"""),_display_(Seq[Any](/*41.90*/tema/*41.94*/.getName())),format.raw/*41.104*/("""</a></li>
                                """)))})),format.raw/*42.34*/("""
                                <li class="uk-divider"></li>
                            """)))})),format.raw/*44.30*/("""
                        </ul>
                    </div>
                </div>
                <!-- ---------------- MAIN CONTENT ---------------- -->
                <div class="uk-width-medium-3-4">
                    <div class="uk-panel uk-panel-box">
                        <div class="uk-article">
                                <h1>Bem-vindo(a) ao Portal do Leite!</h1>
                                 <div class="uk-button-dropdown uk-align-right" data-uk-dropdown=""""),format.raw/*53.99*/("""{"""),format.raw/*53.100*/("""mode:'click'"""),format.raw/*53.112*/("""}"""),format.raw/*53.113*/("""">
                                    <button class="uk-button uk-button-primary uk-button uk-align-right">Dicas recentes
                                    <i class="uk-icon-caret-down"></i>
                                    </button>
                                    <div class="uk-dropdown">
                                        <ul class="uk-nav uk-nav-dropdown uk-text-center">
                                            <li class="uk-nav-header">ORDENAR POR</li>
                                            <li class="uk-nav-divider"></li>
                                            <li><a>Mais recentes</a></li>
                                            <li><a>Mais concordâncias</a></li>
                                            <li><a>Mais discordâncias</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <h3>Dicas Postadas Recentemente:</h3><br>

                            """),_display_(Seq[Any](/*69.30*/if(dicas.isEmpty())/*69.49*/{_display_(Seq[Any](format.raw/*69.50*/("""
                            <p>Não existem dicas</p>
                             """)))})),format.raw/*71.31*/("""
<div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*72.60*/("""{"""),format.raw/*72.61*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*72.98*/("""}"""),format.raw/*72.99*/("""">

                            """),_display_(Seq[Any](/*74.30*/for(dica <- dicas) yield /*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""
                        <div>
                           
                            <div>
                                <a class="uk-article-meta uk-text-success">
                                Informações sobre <strong>""""),_display_(Seq[Any](/*79.61*/dica/*79.65*/.getTema().getName())),format.raw/*79.85*/(""""</strong> <i class="uk-icon-hover uk-icon-info-circle"></i>, tema da disciplina: <strong>""""),_display_(Seq[Any](/*79.177*/dica/*79.181*/.getTema().getDisciplina().getNome())),format.raw/*79.217*/(""""</strong></a>   
                            </div>
                            <hr class="uk-article-divider">
                       
  
                                """),_display_(Seq[Any](/*84.34*/if(dica.getTipo().equals("DicaDisciplina"))/*84.77*/{_display_(Seq[Any](format.raw/*84.78*/("""
                                    <p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*85.92*/dica/*85.96*/.getTexto())),format.raw/*85.107*/("""</p>
                                    <p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*86.74*/dica/*86.78*/.getInstanciaDisciplina.getRazao())),format.raw/*86.112*/("""</p>
                                """)))})),format.raw/*87.34*/("""
                                """),_display_(Seq[Any](/*88.34*/if(dica.getTipo().equals("DicaMaterial"))/*88.75*/{_display_(Seq[Any](format.raw/*88.76*/("""
                                    <p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*89.78*/dica/*89.82*/.getTexto())),format.raw/*89.93*/("""">"""),_display_(Seq[Any](/*89.96*/dica/*89.100*/.getTexto())),format.raw/*89.111*/("""</a>
                                """)))})),format.raw/*90.34*/("""
                                """),_display_(Seq[Any](/*91.34*/if(dica.getTipo().equals("DicaConselho"))/*91.75*/{_display_(Seq[Any](format.raw/*91.76*/("""
                                    <p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*92.77*/dica/*92.81*/.getTexto())),format.raw/*92.92*/("""</p>
                                """)))})),format.raw/*93.34*/("""
                                """),_display_(Seq[Any](/*94.34*/if(dica.getTipo().equals("DicaAssunto"))/*94.74*/{_display_(Seq[Any](format.raw/*94.75*/("""
                                    <p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*95.89*/dica/*95.93*/.getTexto())),format.raw/*95.104*/("""</p>
                                """)))})),format.raw/*96.34*/("""
                                
                                <p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*98.79*/dica/*98.83*/.getUser())),format.raw/*98.93*/("""</p>

                                    <hr class="uk-article-divider-orange">
                                    <br>
 
                            """)))})),format.raw/*103.30*/("""
                      
                        </div>
                    </div>
                </div>
</div>

            </div>
    </body>
</html>
"""))}
    }
    
    def render(disciplinas:List[Disciplina],dicas:List[Dica]): play.api.templates.HtmlFormat.Appendable = apply(disciplinas,dicas)
    
    def f:((List[Disciplina],List[Dica]) => play.api.templates.HtmlFormat.Appendable) = (disciplinas,dicas) => apply(disciplinas,dicas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 25 23:59:11 GMT-03:00 2015
                    SOURCE: C:/Users/Carol/workspace/portaldoleitelc/app/views/index.scala.html
                    HASH: aba7e0eb7ddafe5e61868017aafe1b45d208258a
                    MATRIX: 795->1|939->51|1176->253|1190->259|1245->293|1338->350|1353->356|1425->405|1523->467|1538->473|1592->505|1750->627|1765->633|1821->667|2113->923|2129->930|2167->946|2427->1170|2442->1176|2494->1205|3279->1954|3325->1984|3364->1985|3482->2067|3501->2077|3531->2085|3571->2088|3591->2098|3624->2108|3704->2152|3754->2186|3793->2187|3905->2263|3918->2267|3948->2275|3987->2278|4000->2282|4033->2292|4109->2336|4234->2429|4751->2918|4781->2919|4822->2931|4852->2932|5925->3969|5953->3988|5992->3989|6110->4075|6199->4136|6228->4137|6293->4174|6322->4175|6393->4210|6427->4228|6466->4229|6736->4463|6749->4467|6791->4487|6920->4579|6934->4583|6993->4619|7207->4797|7259->4840|7298->4841|7427->4934|7440->4938|7474->4949|7589->5028|7602->5032|7659->5066|7730->5105|7801->5140|7851->5181|7890->5182|8005->5261|8018->5265|8051->5276|8090->5279|8104->5283|8138->5294|8209->5333|8280->5368|8330->5409|8369->5410|8483->5488|8496->5492|8529->5503|8600->5542|8671->5577|8720->5617|8759->5618|8885->5708|8898->5712|8932->5723|9003->5762|9153->5876|9166->5880|9198->5890|9389->6048
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|51->23|51->23|51->23|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44|81->53|81->53|81->53|81->53|97->69|97->69|97->69|99->71|100->72|100->72|100->72|100->72|102->74|102->74|102->74|107->79|107->79|107->79|107->79|107->79|107->79|112->84|112->84|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|116->88|116->88|116->88|117->89|117->89|117->89|117->89|117->89|117->89|118->90|119->91|119->91|119->91|120->92|120->92|120->92|121->93|122->94|122->94|122->94|123->95|123->95|123->95|124->96|126->98|126->98|126->98|131->103
                    -- GENERATED --
                */
            