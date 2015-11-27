
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
                                            <li><a href ="/atualizaIndex/"""),_display_(Seq[Any](/*61.75*/Dica/*61.79*/.MAIS_RECENTES)),format.raw/*61.93*/("""" >Mais recentes</a></li>
                                            <li><a href ="/atualizaIndex/"""),_display_(Seq[Any](/*62.75*/Dica/*62.79*/.MAIS_CONCORDANCIAS)),format.raw/*62.98*/("""">Mais concordâncias</a></li>
                                            <li><a href ="/atualizaIndex/"""),_display_(Seq[Any](/*63.75*/Dica/*63.79*/.MAIS_DISCORDANCIAS)),format.raw/*63.98*/("""">Mais discordâncias</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <h3>Dicas Postadas:</h3><br>

                            """),_display_(Seq[Any](/*69.30*/if(dicas.isEmpty())/*69.49*/{_display_(Seq[Any](format.raw/*69.50*/("""
                            <p>Não existem dicas</p>
                             """)))})),format.raw/*71.31*/("""


                            """),_display_(Seq[Any](/*74.30*/for(dica <- dicas) yield /*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""
                        <div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*75.84*/("""{"""),format.raw/*75.85*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*75.122*/("""}"""),format.raw/*75.123*/("""">
                           
                            <div>
                                <a class="uk-article-meta uk-text-success">
                                Informações sobre <strong>""""),_display_(Seq[Any](/*79.61*/dica/*79.65*/.getTema().getName())),format.raw/*79.85*/(""""</strong> <i class="uk-icon-hover uk-icon-info-circle"></i>, tema da disciplina: <strong>""""),_display_(Seq[Any](/*79.177*/dica/*79.181*/.getDisciplina().getNome())),format.raw/*79.207*/(""""</strong></a>   
                            </div>
                            <hr class="uk-article-divider">
                       
  
                                """),_display_(Seq[Any](/*84.34*/if(dica.getTipo().equals("DicaDisciplina"))/*84.77*/{_display_(Seq[Any](format.raw/*84.78*/("""
                                    <p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*85.92*/dica/*85.96*/.getTexto())),format.raw/*85.107*/("""</p>
                                    <p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*86.74*/dica/*86.78*/.getRazao())),format.raw/*86.89*/("""</p>
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
 </div><br>
                            """)))})),format.raw/*102.30*/("""
                      
                       
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
                    DATE: Fri Nov 27 00:29:35 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master22/portaldoleite-master/app/views/index.scala.html
                    HASH: cfa9847f03551225e36e74193aec7c905cb2b165
                    MATRIX: 795->1|939->51|1168->245|1182->251|1237->285|1329->341|1344->347|1416->396|1513->457|1528->463|1582->495|1738->615|1753->621|1809->655|2095->905|2111->912|2149->928|2405->1148|2420->1154|2472->1183|3242->1917|3288->1947|3327->1948|3444->2029|3463->2039|3493->2047|3533->2050|3553->2060|3586->2070|3665->2113|3715->2147|3754->2148|3865->2223|3878->2227|3908->2235|3947->2238|3960->2242|3993->2252|4068->2295|4191->2386|4699->2866|4729->2867|4770->2879|4800->2880|5467->3511|5480->3515|5516->3529|5652->3629|5665->3633|5706->3652|5846->3756|5859->3760|5900->3779|6185->4028|6213->4047|6252->4048|6368->4132|6436->4164|6470->4182|6509->4183|6621->4267|6650->4268|6716->4305|6746->4306|6983->4507|6996->4511|7038->4531|7167->4623|7181->4627|7230->4653|7439->4826|7491->4869|7530->4870|7658->4962|7671->4966|7705->4977|7819->5055|7832->5059|7865->5070|7935->5108|8005->5142|8055->5183|8094->5184|8208->5262|8221->5266|8254->5277|8293->5280|8307->5284|8341->5295|8411->5333|8481->5367|8531->5408|8570->5409|8683->5486|8696->5490|8729->5501|8799->5539|8869->5573|8918->5613|8957->5614|9082->5703|9095->5707|9129->5718|9199->5756|9347->5868|9360->5872|9392->5882|9564->6021
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|51->23|51->23|51->23|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44|81->53|81->53|81->53|81->53|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|97->69|97->69|97->69|99->71|102->74|102->74|102->74|103->75|103->75|103->75|103->75|107->79|107->79|107->79|107->79|107->79|107->79|112->84|112->84|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|116->88|116->88|116->88|117->89|117->89|117->89|117->89|117->89|117->89|118->90|119->91|119->91|119->91|120->92|120->92|120->92|121->93|122->94|122->94|122->94|123->95|123->95|123->95|124->96|126->98|126->98|126->98|130->102
                    -- GENERATED --
                */
            