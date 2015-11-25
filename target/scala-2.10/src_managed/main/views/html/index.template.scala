
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
                            <div>
                            </div>
                            <hr class="uk-article-divider-orange">
                            """),_display_(Seq[Any](/*56.30*/if(dicas.isEmpty())/*56.49*/{_display_(Seq[Any](format.raw/*56.50*/("""
                            <p>Não existem dicas</p>
                        """)))})),format.raw/*58.26*/("""
                            """),_display_(Seq[Any](/*59.30*/for(dica <- dicas) yield /*59.48*/{_display_(Seq[Any](format.raw/*59.49*/("""
                        <a class="uk-article-meta uk-text-success" data-uk-modal=""""),format.raw/*60.83*/("""{"""),format.raw/*60.84*/("""target:'#avaliacao-modal'"""),format.raw/*60.109*/("""}"""),format.raw/*60.110*/("""">
                                Informações sobre <strong>""""),_display_(Seq[Any](/*61.61*/dica/*61.65*/.getTema().getName())),format.raw/*61.85*/(""""</strong> <i class="uk-icon-hover uk-icon-info-circle"></i>, tema da disciplina: <strong>""""),_display_(Seq[Any](/*61.177*/dica/*61.181*/.getTema().getDisciplina().getNome())),format.raw/*61.217*/(""""</strong></a>   
                            </div>
                            <hr class="uk-article-divider-orange">
                        </div>
                        <div id="dicasList">
                            <div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*66.88*/("""{"""),format.raw/*66.89*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*66.126*/("""}"""),format.raw/*66.127*/("""">
                                """),_display_(Seq[Any](/*67.34*/if(!dica.wasFlaggedByUser(session.get("login")))/*67.82*/{_display_(Seq[Any](format.raw/*67.83*/("""
                                    <form name="formDenunciar"""),_display_(Seq[Any](/*68.63*/dica/*68.67*/.getId())),format.raw/*68.75*/("""" method="post" action="/denunciarDica/"""),_display_(Seq[Any](/*68.115*/dica/*68.119*/.getId())),format.raw/*68.127*/(""""></form>
                                    <a data-uk-tooltip title="Denunciar dica" 
                                        class="uk-text-warning uk-icon-hover uk-icon-flag uk-panel-badge" href="javascript:denunciarDica("""),_display_(Seq[Any](/*70.139*/dica/*70.143*/.getId())),format.raw/*70.151*/(""")"></a>
                                """)))})),format.raw/*71.34*/("""
                                """),_display_(Seq[Any](/*72.34*/if(dica.getTipo().equals("DicaDisciplina"))/*72.77*/{_display_(Seq[Any](format.raw/*72.78*/("""
                                    <p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*73.92*/dica/*73.96*/.getTexto())),format.raw/*73.107*/("""</p>
                                    <p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*74.74*/dica/*74.78*/.getInstanciaDisciplina.getRazao())),format.raw/*74.112*/("""</p>
                                """)))})),format.raw/*75.34*/("""
                                """),_display_(Seq[Any](/*76.34*/if(dica.getTipo().equals("DicaMaterial"))/*76.75*/{_display_(Seq[Any](format.raw/*76.76*/("""
                                    <p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*77.78*/dica/*77.82*/.getTexto())),format.raw/*77.93*/("""">"""),_display_(Seq[Any](/*77.96*/dica/*77.100*/.getTexto())),format.raw/*77.111*/("""</a>
                                """)))})),format.raw/*78.34*/("""
                                """),_display_(Seq[Any](/*79.34*/if(dica.getTipo().equals("DicaConselho"))/*79.75*/{_display_(Seq[Any](format.raw/*79.76*/("""
                                    <p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*80.77*/dica/*80.81*/.getTexto())),format.raw/*80.92*/("""</p>
                                """)))})),format.raw/*81.34*/("""
                                """),_display_(Seq[Any](/*82.34*/if(dica.getTipo().equals("DicaAssunto"))/*82.74*/{_display_(Seq[Any](format.raw/*82.75*/("""
                                    <p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*83.89*/dica/*83.93*/.getTexto())),format.raw/*83.104*/("""</p>
                                """)))})),format.raw/*84.34*/("""
                                
                                <p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*86.79*/dica/*86.83*/.getUser())),format.raw/*86.93*/("""</p>
                                <hr class="uk-article-divider-orange">
                                <div class="uk-grid center">
                                    <div class="uk-width-small-1-3">
                                        <span class="normal-font">Avaliação:</span> """),_display_(Seq[Any](/*90.86*/dica/*90.90*/.getIndiceConcordancia())),format.raw/*90.114*/("""
                                    </div>
                                    <div class="uk-width-small-1-3">
                                        <span class="normal-font">Avalie:</span>
                                        """),_display_(Seq[Any](/*94.42*/if(!dica.wasVotedByUser(session.get("login")) && !dica.isUnvotable())/*94.111*/{_display_(Seq[Any](format.raw/*94.112*/("""
                                            <form name="formUpVote"""),_display_(Seq[Any](/*95.68*/dica/*95.72*/.getId())),format.raw/*95.80*/("""" method="post" action="/upVoteDica/"""),_display_(Seq[Any](/*95.117*/dica/*95.121*/.getId())),format.raw/*95.129*/(""""></form>
                                            <a class="uk-icon-hover uk-icon-thumbs-up uk-text-success" href="javascript:DoPost("""),_display_(Seq[Any](/*96.129*/dica/*96.133*/.getId())),format.raw/*96.141*/(""")"></a>
                                            <a class="uk-icon-hover uk-icon-thumbs-down uk-text-success" 
                                                data-uk-modal=""""),format.raw/*98.64*/("""{"""),format.raw/*98.65*/("""target:'#dica-add-discordancia-modal-"""),_display_(Seq[Any](/*98.103*/dica/*98.107*/.getId())),format.raw/*98.115*/("""'"""),format.raw/*98.116*/("""}"""),format.raw/*98.117*/(""""></a>
                                        """)))}/*99.43*/else/*99.48*/{_display_(Seq[Any](format.raw/*99.49*/("""
                                            <i class="uk-icon-hover uk-icon-thumbs-up"></i>
                                            <i class="uk-icon-hover uk-icon-thumbs-down"></i>
                                        """)))})),format.raw/*102.42*/("""
                                    </div>
                                    <div class="uk-width-small-1-3">
                                        <span class="normal-font">Discordâncias:</span>
                                        <a class="uk-icon-hover uk-icon-comments-o uk-text-success"
                                            data-uk-modal=""""),format.raw/*107.60*/("""{"""),format.raw/*107.61*/("""target:'#dica-discordancias-modal-"""),_display_(Seq[Any](/*107.96*/dica/*107.100*/.getId())),format.raw/*107.108*/("""'"""),format.raw/*107.109*/("""}"""),format.raw/*107.110*/(""""></a>
                                    </div>
                                </div>
                            </div>
                            <hr class="uk-article-divider">
                                <!---------------- MODAL DISCORDÂNCIAS ---------------->
                                <div id="dica-discordancias-modal-"""),_display_(Seq[Any](/*113.68*/dica/*113.72*/.getId())),format.raw/*113.80*/("""" class="uk-modal">
                                    <div class="uk-modal-dialog">
                                        <a class="uk-modal-close uk-close"></a>
                                        <div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Discordâncias</h2></div>
                                        <div class="uk-overflow-container">
                                        """),_display_(Seq[Any](/*118.42*/if(dica.getUsersCommentaries().entrySet().isEmpty())/*118.94*/{_display_(Seq[Any](format.raw/*118.95*/("""
                                            <p>Nenhuma discordância adicionada.</p>
                                        """)))})),format.raw/*120.42*/("""
                                        """),_display_(Seq[Any](/*121.42*/for(discordancia <- dica.getUsersCommentaries().entrySet()) yield /*121.101*/{_display_(Seq[Any](format.raw/*121.102*/("""
                                            <div class="uk-panel uk-panel-box dica">
                                                <p class="normal-font">"""),_display_(Seq[Any](/*123.73*/discordancia/*123.85*/.getValue())),format.raw/*123.96*/("""</p>
                                                <p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*124.95*/discordancia/*124.107*/.getKey())),format.raw/*124.116*/("""</p>
                                            </div>
                                            <hr class="uk-article-divider">
                                        """)))})),format.raw/*127.42*/("""
                                        </div>
                                    </div>
                                </div>
                                <!---------------- MODAL ADD DISCORDÂNCIA ---------------->
                                <div id="dica-add-discordancia-modal-"""),_display_(Seq[Any](/*132.71*/dica/*132.75*/.getId())),format.raw/*132.83*/("""" class="uk-modal">
                                    <div class="uk-modal-dialog">
                                        <a class="uk-modal-close uk-close"></a>
                                        <div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
                                        <div class="uk-container uk-container-center">
                                            <form class="uk-form center" method="post" action="/addDiscordancia/"""),_display_(Seq[Any](/*137.114*/dica/*137.118*/.getId())),format.raw/*137.126*/("""">
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
                            """)))})),format.raw/*149.30*/("""
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
                    DATE: Wed Nov 25 17:23:05 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master/app/views/index.scala.html
                    HASH: cd5b59bd10f296d8bb9c3aa042c10efd9cc4cd30
                    MATRIX: 795->1|939->51|1168->245|1182->251|1237->285|1329->341|1344->347|1416->396|1513->457|1528->463|1582->495|1738->615|1753->621|1809->655|2095->905|2111->912|2149->928|2405->1148|2420->1154|2472->1183|3242->1917|3288->1947|3327->1948|3444->2029|3463->2039|3493->2047|3533->2050|3553->2060|3586->2070|3665->2113|3715->2147|3754->2148|3865->2223|3878->2227|3908->2235|3947->2238|3960->2242|3993->2252|4068->2295|4191->2386|4774->2933|4802->2952|4841->2953|4952->3032|5018->3062|5052->3080|5091->3081|5202->3164|5231->3165|5285->3190|5315->3191|5414->3254|5427->3258|5469->3278|5598->3370|5612->3374|5671->3410|5982->3693|6011->3694|6077->3731|6107->3732|6179->3768|6236->3816|6275->3817|6374->3880|6387->3884|6417->3892|6494->3932|6508->3936|6539->3944|6803->4171|6817->4175|6848->4183|6921->4224|6991->4258|7043->4301|7082->4302|7210->4394|7223->4398|7257->4409|7371->4487|7384->4491|7441->4525|7511->4563|7581->4597|7631->4638|7670->4639|7784->4717|7797->4721|7830->4732|7869->4735|7883->4739|7917->4750|7987->4788|8057->4822|8107->4863|8146->4864|8259->4941|8272->4945|8305->4956|8375->4994|8445->5028|8494->5068|8533->5069|8658->5158|8671->5162|8705->5173|8775->5211|8923->5323|8936->5327|8968->5337|9295->5628|9308->5632|9355->5656|9626->5891|9705->5960|9745->5961|9849->6029|9862->6033|9892->6041|9966->6078|9980->6082|10011->6090|10186->6228|10200->6232|10231->6240|10436->6417|10465->6418|10540->6456|10554->6460|10585->6468|10615->6469|10645->6470|10712->6519|10725->6524|10764->6525|11025->6753|11414->7113|11444->7114|11516->7149|11531->7153|11563->7161|11594->7162|11625->7163|12002->7503|12016->7507|12047->7515|12498->7929|12560->7981|12600->7982|12759->8108|12838->8150|12915->8209|12956->8210|13151->8368|13173->8380|13207->8391|13343->8490|13366->8502|13399->8511|13605->8684|13934->8976|13948->8980|13979->8988|14515->9486|14530->9490|14562->9498|15541->10444
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|47->19|47->19|47->19|51->23|51->23|51->23|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|72->44|84->56|84->56|84->56|86->58|87->59|87->59|87->59|88->60|88->60|88->60|88->60|89->61|89->61|89->61|89->61|89->61|89->61|94->66|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|96->68|96->68|96->68|98->70|98->70|98->70|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|103->75|104->76|104->76|104->76|105->77|105->77|105->77|105->77|105->77|105->77|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|110->82|111->83|111->83|111->83|112->84|114->86|114->86|114->86|118->90|118->90|118->90|122->94|122->94|122->94|123->95|123->95|123->95|123->95|123->95|123->95|124->96|124->96|124->96|126->98|126->98|126->98|126->98|126->98|126->98|126->98|127->99|127->99|127->99|130->102|135->107|135->107|135->107|135->107|135->107|135->107|135->107|141->113|141->113|141->113|146->118|146->118|146->118|148->120|149->121|149->121|149->121|151->123|151->123|151->123|152->124|152->124|152->124|155->127|160->132|160->132|160->132|165->137|165->137|165->137|177->149
                    -- GENERATED --
                */
            