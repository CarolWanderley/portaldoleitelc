
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
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/portalDoLeite_uikit.css"))),format.raw/*9.109*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src="https://code.jquery.com/jquery-2.1.3.js" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/uikit.js"))),format.raw/*12.63*/("""" type="text/javascript"></script>
    </head>
    <body ng-app="">
        <div class="uk-container uk-container-center">
            <div id="topo" class="uk-panel">
                <div class="uk-text-right">
                    <a>Bem-vindo(a), """),_display_(Seq[Any](/*18.39*/session/*18.46*/.get("username"))),format.raw/*18.62*/("""</a> | <a href="/logout">Logout</a>
                    <hr class="uk-article-divider-orange">
                </div>
                <div class="center">
                    <a href="/"><img alt="Portal Do Leite" src=""""),_display_(Seq[Any](/*22.66*/routes/*22.72*/.Assets.at("images/logo.png"))),format.raw/*22.101*/(""""></a>
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
                            """),_display_(Seq[Any](/*37.30*/for(disciplina <- disciplinas) yield /*37.60*/{_display_(Seq[Any](format.raw/*37.61*/("""
                                <li class="uk-nav-header"><a href="/disciplina/"""),_display_(Seq[Any](/*38.81*/disciplina/*38.91*/.getId())),format.raw/*38.99*/("""">"""),_display_(Seq[Any](/*38.102*/disciplina/*38.112*/.getNome())),format.raw/*38.122*/("""</a></li>
                                """),_display_(Seq[Any](/*39.34*/for(tema <- disciplina.getTemas()) yield /*39.68*/{_display_(Seq[Any](format.raw/*39.69*/("""
                                    <li class="uk-parent"><a href="/tema/"""),_display_(Seq[Any](/*40.75*/tema/*40.79*/.getId())),format.raw/*40.87*/("""">"""),_display_(Seq[Any](/*40.90*/tema/*40.94*/.getName())),format.raw/*40.104*/("""</a></li>
                                """)))})),format.raw/*41.34*/("""
                                <li class="uk-divider"></li>
                            """)))})),format.raw/*43.30*/("""
                        </ul>
                    </div>
                </div>
                <!-- ---------------- MAIN CONTENT ---------------- -->
                <div class="uk-width-medium-3-4">
                    <div class="uk-panel uk-panel-box">
                        <div class="uk-article">
                                <h1>Bem-vindo(a) ao Portal do Leite!</h1>
                                 <div class="uk-button-dropdown uk-align-right" data-uk-dropdown=""""),format.raw/*52.99*/("""{"""),format.raw/*52.100*/("""mode:'click'"""),format.raw/*52.112*/("""}"""),format.raw/*52.113*/("""">
                                    <button class="uk-button uk-button-primary uk-button uk-align-right">Dicas recentes
                                    <i class="uk-icon-caret-down"></i>
                                    </button>
                                    <div class="uk-dropdown">
                                        <ul class="uk-nav uk-nav-dropdown uk-text-center">
                                            <li class="uk-nav-header">ORDENAR POR</li>
                                            <li class="uk-nav-divider"></li>
                                            <li><a href ="/atualizaIndex/"""),_display_(Seq[Any](/*60.75*/Dica/*60.79*/.MAIS_RECENTES)),format.raw/*60.93*/("""" >Mais recentes</a></li>
                                            <li><a href ="/atualizaIndex/"""),_display_(Seq[Any](/*61.75*/Dica/*61.79*/.MAIS_CONCORDANCIAS)),format.raw/*61.98*/("""">Mais concordâncias</a></li>
                                            <li><a href ="/atualizaIndex/"""),_display_(Seq[Any](/*62.75*/Dica/*62.79*/.MAIS_DISCORDANCIAS)),format.raw/*62.98*/("""">Mais discordâncias</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <h3>Dicas Postadas:</h3><br>

                            """),_display_(Seq[Any](/*68.30*/if(dicas.isEmpty())/*68.49*/{_display_(Seq[Any](format.raw/*68.50*/("""
                            <p>Não existem dicas</p>
                             """)))})),format.raw/*70.31*/("""
                     
             
                        """),_display_(Seq[Any](/*73.26*/for(dica <- dicas) yield /*73.44*/{_display_(Seq[Any](format.raw/*73.45*/("""
                            
                        
                        <div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*76.84*/("""{"""),format.raw/*76.85*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*76.122*/("""}"""),format.raw/*76.123*/("""">
                           
                            <div>
                                <a class="uk-article-meta uk-text-success">
                                <span class="icon-lamp"></span> Informações sobre <strong>""""),_display_(Seq[Any](/*80.93*/dica/*80.97*/.getTema().getName())),format.raw/*80.117*/(""""</strong>, tema da disciplina: <strong>""""),_display_(Seq[Any](/*80.159*/dica/*80.163*/.getDisciplina().getNome())),format.raw/*80.189*/(""""</strong></a>   
                            </div>
                            <hr class="uk-article-divider">
                       
  
                                """),_display_(Seq[Any](/*85.34*/if(dica.getTipo().equals("DicaDisciplina"))/*85.77*/{_display_(Seq[Any](format.raw/*85.78*/("""
                                    <p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*86.92*/dica/*86.96*/.getTexto())),format.raw/*86.107*/("""</p>
                                    <p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*87.74*/dica/*87.78*/.getRazao())),format.raw/*87.89*/("""</p>
                                    <div class="uk-button-dropdown" data-uk-dropdown=""""),format.raw/*88.87*/("""{"""),format.raw/*88.88*/("""mode:'click'"""),format.raw/*88.100*/("""}"""),format.raw/*88.101*/("""">
                                                 <button class="uk-button uk-button-primary uk-button"><span class="icon-menu" id="botao-dica-menu"></span> Detalhes <i class="uk-icon-caret-down"></i>
                                                </button>
                                                <div class="uk-dropdown">
                                                    <li><i class="uk-icon-hover uk-icon-thumbs-up"></i> """),_display_(Seq[Any](/*92.106*/dica/*92.110*/.getConcordancias())),format.raw/*92.129*/(""" <i class="uk-icon-hover uk-icon-thumbs-down"></i> """),_display_(Seq[Any](/*92.181*/dica/*92.185*/.getDiscordancias())),format.raw/*92.204*/("""</li>
                                                </div>
                                            </div>
                                """)))})),format.raw/*95.34*/("""
                                """),_display_(Seq[Any](/*96.34*/if(dica.getTipo().equals("DicaMaterial"))/*96.75*/{_display_(Seq[Any](format.raw/*96.76*/("""
                                    <p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*97.78*/dica/*97.82*/.getTexto())),format.raw/*97.93*/("""">"""),_display_(Seq[Any](/*97.96*/dica/*97.100*/.getTexto())),format.raw/*97.111*/("""</a><br>
                                    <div class="uk-button-dropdown" data-uk-dropdown=""""),format.raw/*98.87*/("""{"""),format.raw/*98.88*/("""mode:'click'"""),format.raw/*98.100*/("""}"""),format.raw/*98.101*/("""">
                                                <button class="uk-button uk-button-primary uk-button"><span class="icon-menu" id="botao-dica-menu"></span> Detalhes <i class="uk-icon-caret-down"></i>
                                                </button>
                                                <div class="uk-dropdown">
                                                    <li><i class="uk-icon-hover uk-icon-thumbs-up"></i> """),_display_(Seq[Any](/*102.106*/dica/*102.110*/.getConcordancias())),format.raw/*102.129*/(""" <i class="uk-icon-hover uk-icon-thumbs-down"></i> """),_display_(Seq[Any](/*102.181*/dica/*102.185*/.getDiscordancias())),format.raw/*102.204*/("""</li>
                                                </div>
                                            </div>
                                """)))})),format.raw/*105.34*/("""
                                """),_display_(Seq[Any](/*106.34*/if(dica.getTipo().equals("DicaConselho"))/*106.75*/{_display_(Seq[Any](format.raw/*106.76*/("""
                                    <p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*107.77*/dica/*107.81*/.getTexto())),format.raw/*107.92*/("""</p>
                                    <div class="uk-button-dropdown" data-uk-dropdown=""""),format.raw/*108.87*/("""{"""),format.raw/*108.88*/("""mode:'click'"""),format.raw/*108.100*/("""}"""),format.raw/*108.101*/("""">
                                                 <button class="uk-button uk-button-primary uk-button"><span class="icon-menu" id="botao-dica-menu"></span> Detalhes <i class="uk-icon-caret-down"></i>
                                                </button>
                                                <div class="uk-dropdown">
                                                    <li><i class="uk-icon-hover uk-icon-thumbs-up"></i> """),_display_(Seq[Any](/*112.106*/dica/*112.110*/.getConcordancias())),format.raw/*112.129*/(""" <i class="uk-icon-hover uk-icon-thumbs-down"></i> """),_display_(Seq[Any](/*112.181*/dica/*112.185*/.getDiscordancias())),format.raw/*112.204*/("""</li>
                                                </div>
                                            </div>
                                """)))})),format.raw/*115.34*/("""
                                """),_display_(Seq[Any](/*116.34*/if(dica.getTipo().equals("DicaAssunto"))/*116.74*/{_display_(Seq[Any](format.raw/*116.75*/("""
                                    <p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*117.89*/dica/*117.93*/.getTexto())),format.raw/*117.104*/("""</p>
                                    <div class="uk-button-dropdown" data-uk-dropdown=""""),format.raw/*118.87*/("""{"""),format.raw/*118.88*/("""mode:'click'"""),format.raw/*118.100*/("""}"""),format.raw/*118.101*/("""">
                                                   <button class="uk-button uk-button-primary uk-button"><span class="icon-menu" id="botao-dica-menu"></span> Detalhes <i class="uk-icon-caret-down"></i>
                                                </button>
                                                <div class="uk-dropdown">
                                                    <li><i class="uk-icon-hover uk-icon-thumbs-up"></i> """),_display_(Seq[Any](/*122.106*/dica/*122.110*/.getConcordancias())),format.raw/*122.129*/(""" <i class="uk-icon-hover uk-icon-thumbs-down"></i> """),_display_(Seq[Any](/*122.181*/dica/*122.185*/.getDiscordancias())),format.raw/*122.204*/("""</li>
                                                </div>
                                            </div>
                                """)))})),format.raw/*125.34*/("""
                                
                                <p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*127.79*/dica/*127.83*/.getUser())),format.raw/*127.93*/("""</p>
                                <hr class="uk-article-divider-orange">
                                <br>
                                </div><br>
                             
                      
                       """)))})),format.raw/*133.25*/("""
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
                    DATE: Fri Nov 27 01:03:52 GMT-03:00 2015
                    SOURCE: C:/Users/Carol/workspace/portaldoleitelc/app/views/index.scala.html
                    HASH: 5f5fb3055a114c03c556ff6e2d0b4f9cf3d1a777
                    MATRIX: 795->1|939->51|1174->251|1188->257|1243->291|1335->348|1349->354|1420->403|1518->465|1533->471|1587->503|1745->625|1760->631|1816->665|2108->921|2124->928|2162->944|2422->1168|2437->1174|2489->1203|3274->1952|3320->1982|3359->1983|3477->2065|3496->2075|3526->2083|3566->2086|3586->2096|3619->2106|3699->2150|3749->2184|3788->2185|3900->2261|3913->2265|3943->2273|3982->2276|3995->2280|4028->2290|4104->2334|4229->2427|4746->2916|4776->2917|4817->2929|4847->2930|5522->3569|5535->3573|5571->3587|5708->3688|5721->3692|5762->3711|5903->3816|5916->3820|5957->3839|6248->4094|6276->4113|6315->4114|6433->4200|6534->4265|6568->4283|6607->4284|6776->4425|6805->4426|6871->4463|6901->4464|7174->4701|7187->4705|7230->4725|7309->4767|7323->4771|7372->4797|7586->4975|7638->5018|7677->5019|7806->5112|7819->5116|7853->5127|7968->5206|7981->5210|8014->5221|8134->5313|8163->5314|8204->5326|8234->5327|8715->5771|8729->5775|8771->5794|8860->5846|8874->5850|8916->5869|9096->6017|9167->6052|9217->6093|9256->6094|9371->6173|9384->6177|9417->6188|9456->6191|9470->6195|9504->6206|9628->6302|9657->6303|9698->6315|9728->6316|10209->6759|10224->6763|10267->6782|10357->6834|10372->6838|10415->6857|10596->7005|10668->7040|10719->7081|10759->7082|10874->7160|10888->7164|10922->7175|11043->7267|11073->7268|11115->7280|11146->7281|11628->7725|11643->7729|11686->7748|11776->7800|11791->7804|11834->7823|12015->7971|12087->8006|12137->8046|12177->8047|12304->8137|12318->8141|12353->8152|12474->8244|12504->8245|12546->8257|12577->8258|13061->8704|13076->8708|13119->8727|13209->8779|13224->8783|13267->8802|13448->8950|13599->9064|13613->9068|13646->9078|13918->9317
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|46->18|46->18|46->18|50->22|50->22|50->22|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|69->41|71->43|80->52|80->52|80->52|80->52|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|96->68|96->68|96->68|98->70|101->73|101->73|101->73|104->76|104->76|104->76|104->76|108->80|108->80|108->80|108->80|108->80|108->80|113->85|113->85|113->85|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|116->88|120->92|120->92|120->92|120->92|120->92|120->92|123->95|124->96|124->96|124->96|125->97|125->97|125->97|125->97|125->97|125->97|126->98|126->98|126->98|126->98|130->102|130->102|130->102|130->102|130->102|130->102|133->105|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|136->108|140->112|140->112|140->112|140->112|140->112|140->112|143->115|144->116|144->116|144->116|145->117|145->117|145->117|146->118|146->118|146->118|146->118|150->122|150->122|150->122|150->122|150->122|150->122|153->125|155->127|155->127|155->127|161->133
                    -- GENERATED --
                */
            