
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
                                <h3>Dicas Postadas Recentemente:</h3>
                            <div>
                            </div>
                            <hr class="uk-article-divider-orange">
                            """),_display_(Seq[Any](/*57.30*/if(dicas.isEmpty())/*57.49*/{_display_(Seq[Any](format.raw/*57.50*/("""
                            <p>Não existem dicas</p>
                        """)))})),format.raw/*59.26*/("""
                            """),_display_(Seq[Any](/*60.30*/for(dica <- dicas) yield /*60.48*/{_display_(Seq[Any](format.raw/*60.49*/("""
                        <div>
                            <div>
                        <a class="uk-article-meta uk-text-success" data-uk-modal=""""),format.raw/*63.83*/("""{"""),format.raw/*63.84*/("""target:'#avaliacao-modal'"""),format.raw/*63.109*/("""}"""),format.raw/*63.110*/("""">
                                Informações sobre <strong>""""),_display_(Seq[Any](/*64.61*/dica/*64.65*/.getTema().getName())),format.raw/*64.85*/(""""</strong> <i class="uk-icon-hover uk-icon-info-circle"></i>, tema da disciplina: <strong>""""),_display_(Seq[Any](/*64.177*/dica/*64.181*/.getTema().getDisciplina().getNome())),format.raw/*64.217*/(""""</strong></a>   
                            </div>
                            <hr class="uk-article-divider-orange">
                        </div>
                        <div id="dicasList">
                            <div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*69.88*/("""{"""),format.raw/*69.89*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*69.126*/("""}"""),format.raw/*69.127*/("""">
                                """),_display_(Seq[Any](/*70.34*/if(!dica.wasFlaggedByUser(session.get("login")))/*70.82*/{_display_(Seq[Any](format.raw/*70.83*/("""
                                    <form name="formDenunciar"""),_display_(Seq[Any](/*71.63*/dica/*71.67*/.getId())),format.raw/*71.75*/("""" method="post" action="/denunciarDica/"""),_display_(Seq[Any](/*71.115*/dica/*71.119*/.getId())),format.raw/*71.127*/(""""></form>
                                    <a data-uk-tooltip title="Denunciar dica" 
                                        class="uk-text-warning uk-icon-hover uk-icon-flag uk-panel-badge" href="javascript:denunciarDica("""),_display_(Seq[Any](/*73.139*/dica/*73.143*/.getId())),format.raw/*73.151*/(""")"></a>
                                """)))})),format.raw/*74.34*/("""
                                """),_display_(Seq[Any](/*75.34*/if(dica.getTipo().equals("DicaDisciplina"))/*75.77*/{_display_(Seq[Any](format.raw/*75.78*/("""
                                    <p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*76.92*/dica/*76.96*/.getTexto())),format.raw/*76.107*/("""</p>
                                    <p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*77.74*/dica/*77.78*/.getInstanciaDisciplina.getRazao())),format.raw/*77.112*/("""</p>
                                """)))})),format.raw/*78.34*/("""
                                """),_display_(Seq[Any](/*79.34*/if(dica.getTipo().equals("DicaMaterial"))/*79.75*/{_display_(Seq[Any](format.raw/*79.76*/("""
                                    <p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*80.78*/dica/*80.82*/.getTexto())),format.raw/*80.93*/("""">"""),_display_(Seq[Any](/*80.96*/dica/*80.100*/.getTexto())),format.raw/*80.111*/("""</a>
                                """)))})),format.raw/*81.34*/("""
                                """),_display_(Seq[Any](/*82.34*/if(dica.getTipo().equals("DicaConselho"))/*82.75*/{_display_(Seq[Any](format.raw/*82.76*/("""
                                    <p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*83.77*/dica/*83.81*/.getTexto())),format.raw/*83.92*/("""</p>
                                """)))})),format.raw/*84.34*/("""
                                """),_display_(Seq[Any](/*85.34*/if(dica.getTipo().equals("DicaAssunto"))/*85.74*/{_display_(Seq[Any](format.raw/*85.75*/("""
                                    <p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*86.89*/dica/*86.93*/.getTexto())),format.raw/*86.104*/("""</p>
                                """)))})),format.raw/*87.34*/("""
                                
                                <p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*89.79*/dica/*89.83*/.getUser())),format.raw/*89.93*/("""</p>
                                <hr class="uk-article-divider-orange">
                                <div class="uk-grid center">
                                    <div class="uk-width-small-1-3">
                                        <span class="normal-font">Avaliação:</span> """),_display_(Seq[Any](/*93.86*/dica/*93.90*/.getIndiceConcordancia())),format.raw/*93.114*/("""
                                    </div>
                                    <div class="uk-width-small-1-3">
                                        <span class="normal-font">Avalie:</span>
                                        """),_display_(Seq[Any](/*97.42*/if(!dica.wasVotedByUser(session.get("login")) && !dica.isUnvotable())/*97.111*/{_display_(Seq[Any](format.raw/*97.112*/("""
                                            <form name="formUpVote"""),_display_(Seq[Any](/*98.68*/dica/*98.72*/.getId())),format.raw/*98.80*/("""" method="post" action="/upVoteDica/"""),_display_(Seq[Any](/*98.117*/dica/*98.121*/.getId())),format.raw/*98.129*/(""""></form>
                                            <a class="uk-icon-hover uk-icon-thumbs-up uk-text-success" href="javascript:DoPost("""),_display_(Seq[Any](/*99.129*/dica/*99.133*/.getId())),format.raw/*99.141*/(""")"></a>
                                            <a class="uk-icon-hover uk-icon-thumbs-down uk-text-success" 
                                                data-uk-modal=""""),format.raw/*101.64*/("""{"""),format.raw/*101.65*/("""target:'#dica-add-discordancia-modal-"""),_display_(Seq[Any](/*101.103*/dica/*101.107*/.getId())),format.raw/*101.115*/("""'"""),format.raw/*101.116*/("""}"""),format.raw/*101.117*/(""""></a>
                                        """)))}/*102.43*/else/*102.48*/{_display_(Seq[Any](format.raw/*102.49*/("""
                                            <i class="uk-icon-hover uk-icon-thumbs-up"></i>
                                            <i class="uk-icon-hover uk-icon-thumbs-down"></i>
                                        """)))})),format.raw/*105.42*/("""
                                    </div>
                                    <div class="uk-width-small-1-3">
                                        <span class="normal-font">Discordâncias:</span>
                                        <a class="uk-icon-hover uk-icon-comments-o uk-text-success"
                                            data-uk-modal=""""),format.raw/*110.60*/("""{"""),format.raw/*110.61*/("""target:'#dica-discordancias-modal-"""),_display_(Seq[Any](/*110.96*/dica/*110.100*/.getId())),format.raw/*110.108*/("""'"""),format.raw/*110.109*/("""}"""),format.raw/*110.110*/(""""></a>
                                    </div>
                                </div>
                            </div>
                            <hr class="uk-article-divider">
                                <!---------------- MODAL DISCORDÂNCIAS ---------------->
                                <div id="dica-discordancias-modal-"""),_display_(Seq[Any](/*116.68*/dica/*116.72*/.getId())),format.raw/*116.80*/("""" class="uk-modal">
                                    <div class="uk-modal-dialog">
                                        <a class="uk-modal-close uk-close"></a>
                                        <div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Discordâncias</h2></div>
                                        <div class="uk-overflow-container">
                                        """),_display_(Seq[Any](/*121.42*/if(dica.getUsersCommentaries().entrySet().isEmpty())/*121.94*/{_display_(Seq[Any](format.raw/*121.95*/("""
                                            <p>Nenhuma discordância adicionada.</p>
                                        """)))})),format.raw/*123.42*/("""
                                        """),_display_(Seq[Any](/*124.42*/for(discordancia <- dica.getUsersCommentaries().entrySet()) yield /*124.101*/{_display_(Seq[Any](format.raw/*124.102*/("""
                                            <div class="uk-panel uk-panel-box dica">
                                                <p class="normal-font">"""),_display_(Seq[Any](/*126.73*/discordancia/*126.85*/.getValue())),format.raw/*126.96*/("""</p>
                                                <p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*127.95*/discordancia/*127.107*/.getKey())),format.raw/*127.116*/("""</p>
                                            </div>
                                            <hr class="uk-article-divider">
                                        """)))})),format.raw/*130.42*/("""
                                        </div>
                                    </div>
                                </div>
                                <!---------------- MODAL ADD DISCORDÂNCIA ---------------->
                                <div id="dica-add-discordancia-modal-"""),_display_(Seq[Any](/*135.71*/dica/*135.75*/.getId())),format.raw/*135.83*/("""" class="uk-modal">
                                    <div class="uk-modal-dialog">
                                        <a class="uk-modal-close uk-close"></a>
                                        <div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
                                        <div class="uk-container uk-container-center">
                                            <form class="uk-form center" method="post" action="/addDiscordancia/"""),_display_(Seq[Any](/*140.114*/dica/*140.118*/.getId())),format.raw/*140.126*/("""">
                                                <p>Por que você discorda desta dica?</p>
                                                <textarea cols="70" rows="5" name="discordancia" ng-model="discordancia"
                                                    class="form-control" required>Discordância.</textarea>
                                        </div>
                                                <div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
                                                    <button class="uk-button uk-button-primary" type="submit" ng-disabled="!discordancia">Adicionar</button>
                                                </div>
                                            </form>
                                    </div>
                                </div>
                                <!---------------- FIM MODAL ---------------->
                            """)))})),format.raw/*152.30*/("""
                        </div>
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
                    DATE: Wed Nov 25 18:04:22 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master/app/views/index.scala.html
                    HASH: 2ec10e0abd6cdc4f87345a0a4b3a633c170fe37e
                    MATRIX: 795->1|939->51|1168->245|1182->251|1237->285|1329->341|1344->347|1416->396|1513->457|1528->463|1582->495|1738->615|1753->621|1809->655|2095->905|2111->912|2149->928|2405->1148|2420->1154|2472->1183|3242->1917|3288->1947|3327->1948|3444->2029|3463->2039|3493->2047|3533->2050|3553->2060|3586->2070|3665->2113|3715->2147|3754->2148|3865->2223|3878->2227|3908->2235|3947->2238|3960->2242|3993->2252|4068->2295|4191->2386|4844->3003|4872->3022|4911->3023|5022->3102|5088->3132|5122->3150|5161->3151|5336->3298|5365->3299|5419->3324|5449->3325|5548->3388|5561->3392|5603->3412|5732->3504|5746->3508|5805->3544|6116->3827|6145->3828|6211->3865|6241->3866|6313->3902|6370->3950|6409->3951|6508->4014|6521->4018|6551->4026|6628->4066|6642->4070|6673->4078|6937->4305|6951->4309|6982->4317|7055->4358|7125->4392|7177->4435|7216->4436|7344->4528|7357->4532|7391->4543|7505->4621|7518->4625|7575->4659|7645->4697|7715->4731|7765->4772|7804->4773|7918->4851|7931->4855|7964->4866|8003->4869|8017->4873|8051->4884|8121->4922|8191->4956|8241->4997|8280->4998|8393->5075|8406->5079|8439->5090|8509->5128|8579->5162|8628->5202|8667->5203|8792->5292|8805->5296|8839->5307|8909->5345|9057->5457|9070->5461|9102->5471|9429->5762|9442->5766|9489->5790|9760->6025|9839->6094|9879->6095|9983->6163|9996->6167|10026->6175|10100->6212|10114->6216|10145->6224|10320->6362|10334->6366|10365->6374|10571->6551|10601->6552|10677->6590|10692->6594|10724->6602|10755->6603|10786->6604|10854->6653|10868->6658|10908->6659|11169->6887|11558->7247|11588->7248|11660->7283|11675->7287|11707->7295|11738->7296|11769->7297|12146->7637|12160->7641|12191->7649|12642->8063|12704->8115|12744->8116|12903->8242|12982->8284|13059->8343|13100->8344|13295->8502|13317->8514|13351->8525|13487->8624|13510->8636|13543->8645|13749->8818|14078->9110|14092->9114|14123->9122|14659->9620|14674->9624|14706->9632|15685->10578
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|51->23|51->23|51->23|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44|85->57|85->57|85->57|87->59|88->60|88->60|88->60|91->63|91->63|91->63|91->63|92->64|92->64|92->64|92->64|92->64|92->64|97->69|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|99->71|99->71|99->71|101->73|101->73|101->73|102->74|103->75|103->75|103->75|104->76|104->76|104->76|105->77|105->77|105->77|106->78|107->79|107->79|107->79|108->80|108->80|108->80|108->80|108->80|108->80|109->81|110->82|110->82|110->82|111->83|111->83|111->83|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|117->89|117->89|117->89|121->93|121->93|121->93|125->97|125->97|125->97|126->98|126->98|126->98|126->98|126->98|126->98|127->99|127->99|127->99|129->101|129->101|129->101|129->101|129->101|129->101|129->101|130->102|130->102|130->102|133->105|138->110|138->110|138->110|138->110|138->110|138->110|138->110|144->116|144->116|144->116|149->121|149->121|149->121|151->123|152->124|152->124|152->124|154->126|154->126|154->126|155->127|155->127|155->127|158->130|163->135|163->135|163->135|168->140|168->140|168->140|180->152
                    -- GENERATED --
                */
            