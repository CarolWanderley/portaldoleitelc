
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
object metadica extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Disciplina],Disciplina,MetaDica,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(disciplinas: List[Disciplina])(disciplinaAtual: Disciplina)(metadicaAtual: MetaDica):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.87*/("""

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
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/components/tooltip.js"))),format.raw/*14.76*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*15.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/main.js"))),format.raw/*16.62*/("""" type="text/javascript"></script>
    </head>
    <body ng-app="">
        <div class="uk-container uk-container-center">
    		<div id="topo" class="uk-panel">
				<div class="uk-text-right">
					<a>Bem-vindo(a), """),_display_(Seq[Any](/*22.24*/session/*22.31*/.get("username"))),format.raw/*22.47*/("""</a> | <a href="/logout">Logout</a>
					<hr class="uk-article-divider-orange">
				</div>
				<div class="center">
					<a href="/"><img alt="Portal Do Leite" src=""""),_display_(Seq[Any](/*26.51*/routes/*26.57*/.Assets.at("images/logo.png"))),format.raw/*26.86*/(""""></a>
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
							"""),_display_(Seq[Any](/*41.9*/for(disciplina <- disciplinas) yield /*41.39*/{_display_(Seq[Any](format.raw/*41.40*/("""
            					"""),_display_(Seq[Any](/*42.19*/if(disciplina.getId() == disciplinaAtual.getId())/*42.68*/{_display_(Seq[Any](format.raw/*42.69*/("""
            						<li class="uk-nav-header uk-active"><a href="/disciplina/"""),_display_(Seq[Any](/*43.77*/disciplina/*43.87*/.getId())),format.raw/*43.95*/("""">"""),_display_(Seq[Any](/*43.98*/disciplina/*43.108*/.getNome())),format.raw/*43.118*/("""</a></li>
            					""")))}/*44.20*/else/*44.25*/{_display_(Seq[Any](format.raw/*44.26*/("""
            						<li class="uk-nav-header"><a href="/disciplina/"""),_display_(Seq[Any](/*45.67*/disciplina/*45.77*/.getId())),format.raw/*45.85*/("""">"""),_display_(Seq[Any](/*45.88*/disciplina/*45.98*/.getNome())),format.raw/*45.108*/("""</a></li>
            					""")))})),format.raw/*46.19*/("""
            					"""),_display_(Seq[Any](/*47.19*/for(tema <- disciplina.getTemas()) yield /*47.53*/{_display_(Seq[Any](format.raw/*47.54*/("""
           							<li class="uk-parent"><a href="/tema/"""),_display_(Seq[Any](/*48.57*/tema/*48.61*/.getId())),format.raw/*48.69*/("""">"""),_display_(Seq[Any](/*48.72*/tema/*48.76*/.getName())),format.raw/*48.86*/("""</a></li>
								""")))})),format.raw/*49.10*/("""
								<li class="uk-divider"></li>
							""")))})),format.raw/*51.9*/("""
            			</ul>
            		</div>
            	</div>
            	<!-- ---------------- MAIN CONTENT ---------------- -->
            	<div class="uk-width-medium-3-4">
            		<div class="uk-panel uk-panel-box">
            			<div class="uk-article">
	            				<h2>Dicas indicadas</h2>
            				<div>
	            			</div>
            				<hr class="uk-article-divider-orange">
            			</div>
            			<div id="dicasList">
	            			"""),_display_(Seq[Any](/*65.18*/for(dica <- metadicaAtual.getDicasAdicionadas()) yield /*65.66*/{_display_(Seq[Any](format.raw/*65.67*/("""
	            			<div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*66.76*/("""{"""),format.raw/*66.77*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*66.114*/("""}"""),format.raw/*66.115*/("""">
            					"""),_display_(Seq[Any](/*67.19*/if(!dica.wasFlaggedByUser(session.get("login")))/*67.67*/{_display_(Seq[Any](format.raw/*67.68*/("""
	            					<form name="formDenunciar"""),_display_(Seq[Any](/*68.45*/dica/*68.49*/.getId())),format.raw/*68.57*/("""" method="post" action="/denunciarDica/"""),_display_(Seq[Any](/*68.97*/dica/*68.101*/.getId())),format.raw/*68.109*/(""""></form>
	            					<a data-uk-tooltip title="Denunciar" 
	            						class="uk-text-warning uk-icon-hover uk-icon-flag uk-panel-badge" href="javascript:denunciarDica("""),_display_(Seq[Any](/*70.118*/dica/*70.122*/.getId())),format.raw/*70.130*/(""")"></a>
	            				""")))})),format.raw/*71.19*/("""
            					"""),_display_(Seq[Any](/*72.19*/if(dica.getTipo().equals("DicaDisciplina"))/*72.62*/{_display_(Seq[Any](format.raw/*72.63*/("""
	            					<p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*73.74*/dica/*73.78*/.getTexto())),format.raw/*73.89*/("""</p>
	            					<p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*74.56*/dica/*74.60*/.getInstanciaDisciplina.getRazao())),format.raw/*74.94*/("""</p>
	            				""")))})),format.raw/*75.19*/("""
	            				"""),_display_(Seq[Any](/*76.19*/if(dica.getTipo().equals("DicaMaterial"))/*76.60*/{_display_(Seq[Any](format.raw/*76.61*/("""
	            					<p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*77.60*/dica/*77.64*/.getTexto())),format.raw/*77.75*/("""">"""),_display_(Seq[Any](/*77.78*/dica/*77.82*/.getTexto())),format.raw/*77.93*/("""</a>
	            				""")))})),format.raw/*78.19*/("""
	            				"""),_display_(Seq[Any](/*79.19*/if(dica.getTipo().equals("DicaConselho"))/*79.60*/{_display_(Seq[Any](format.raw/*79.61*/("""
	            					<p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*80.59*/dica/*80.63*/.getTexto())),format.raw/*80.74*/("""</p>
	            				""")))})),format.raw/*81.19*/("""
	            				"""),_display_(Seq[Any](/*82.19*/if(dica.getTipo().equals("DicaAssunto"))/*82.59*/{_display_(Seq[Any](format.raw/*82.60*/("""
	            					<p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*83.71*/dica/*83.75*/.getTexto())),format.raw/*83.86*/("""</p>
	            				""")))})),format.raw/*84.19*/("""
	            				<p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*85.64*/dica/*85.68*/.getUser())),format.raw/*85.78*/("""</p>
	            			</div>
	            			<hr class="uk-article-divider">
	            			""")))})),format.raw/*88.18*/("""
	            			"""),_display_(Seq[Any](/*89.18*/for(metadica <- metadicaAtual.getMetaDicasAdicionadas()) yield /*89.74*/{_display_(Seq[Any](format.raw/*89.75*/("""
		            		<div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*90.76*/("""{"""),format.raw/*90.77*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*90.114*/("""}"""),format.raw/*90.115*/("""">
			            		"""),_display_(Seq[Any](/*91.19*/if(!metadica.wasFlaggedByUser(session.get("login")))/*91.71*/{_display_(Seq[Any](format.raw/*91.72*/("""
		            				<form name="formDenunciarMeta"""),_display_(Seq[Any](/*92.49*/metadica/*92.57*/.getId())),format.raw/*92.65*/("""" method="post" action="/denunciarMetaDica/"""),_display_(Seq[Any](/*92.109*/metadica/*92.117*/.getId())),format.raw/*92.125*/(""""></form>
		            				<a data-uk-tooltip title="Denunciar" 
		            					class="uk-text-warning uk-icon-hover uk-icon-flag uk-panel-badge" href="javascript:denunciarMetaDica("""),_display_(Seq[Any](/*94.122*/metadica/*94.130*/.getId())),format.raw/*94.138*/(""")"></a>
		            			""")))})),format.raw/*95.19*/("""
		            			<p>Comentário: </p><p class="normal-font">"""),_display_(Seq[Any](/*96.61*/metadica/*96.69*/.getComment())),format.raw/*96.82*/("""</p>
	            				<p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*97.64*/metadica/*97.72*/.getUser())),format.raw/*97.82*/("""</p>
            					<a href="/metadica/"""),_display_(Seq[Any](/*98.38*/metadica/*98.46*/.getId())),format.raw/*98.54*/(""""><i class="uk-icon-plus"></i> Mostrar dicas</a>
		            		</div>
	            			<hr class="uk-article-divider">
	            			""")))})),format.raw/*101.18*/("""
	            		</div>
            		</div>
            	</div>
            </div>
        </div>
    </body>
</html>
"""))}
    }
    
    def render(disciplinas:List[Disciplina],disciplinaAtual:Disciplina,metadicaAtual:MetaDica): play.api.templates.HtmlFormat.Appendable = apply(disciplinas)(disciplinaAtual)(metadicaAtual)
    
    def f:((List[Disciplina]) => (Disciplina) => (MetaDica) => play.api.templates.HtmlFormat.Appendable) = (disciplinas) => (disciplinaAtual) => (metadicaAtual) => apply(disciplinas)(disciplinaAtual)(metadicaAtual)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 24 09:38:37 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master/app/views/metadica.scala.html
                    HASH: 9bf912b92351baa2d69020b70c3163f508d29a0b
                    MATRIX: 807->1|986->86|1215->280|1229->286|1284->320|1376->376|1391->382|1463->431|1560->492|1575->498|1629->530|1785->650|1800->656|1856->690|1949->747|1964->753|2033->800|2126->857|2141->863|2203->903|2296->960|2311->966|2366->999|2619->1216|2635->1223|2673->1239|2875->1405|2890->1411|2941->1440|3545->2009|3591->2039|3630->2040|3685->2059|3743->2108|3782->2109|3895->2186|3914->2196|3944->2204|3983->2207|4003->2217|4036->2227|4083->2256|4096->2261|4135->2262|4238->2329|4257->2339|4287->2347|4326->2350|4345->2360|4378->2370|4438->2398|4493->2417|4543->2451|4582->2452|4675->2509|4688->2513|4718->2521|4757->2524|4770->2528|4802->2538|4853->2557|4930->2603|5452->3089|5516->3137|5555->3138|5659->3214|5688->3215|5754->3252|5784->3253|5841->3274|5898->3322|5937->3323|6018->3368|6031->3372|6061->3380|6137->3420|6151->3424|6182->3432|6402->3615|6416->3619|6447->3627|6505->3653|6560->3672|6612->3715|6651->3716|6761->3790|6774->3794|6807->3805|6903->3865|6916->3869|6972->3903|7027->3926|7082->3945|7132->3986|7171->3987|7267->4047|7280->4051|7313->4062|7352->4065|7365->4069|7398->4080|7453->4103|7508->4122|7558->4163|7597->4164|7692->4223|7705->4227|7738->4238|7793->4261|7848->4280|7897->4320|7936->4321|8043->4392|8056->4396|8089->4407|8144->4430|8244->4494|8257->4498|8289->4508|8414->4601|8468->4619|8540->4675|8579->4676|8683->4752|8712->4753|8778->4790|8808->4791|8865->4812|8926->4864|8965->4865|9050->4914|9067->4922|9097->4930|9178->4974|9196->4982|9227->4990|9451->5177|9469->5185|9500->5193|9558->5219|9655->5280|9672->5288|9707->5301|9811->5369|9828->5377|9860->5387|9938->5429|9955->5437|9985->5445|10155->5582
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|54->26|54->26|54->26|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|77->49|79->51|93->65|93->65|93->65|94->66|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|96->68|96->68|96->68|98->70|98->70|98->70|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|103->75|104->76|104->76|104->76|105->77|105->77|105->77|105->77|105->77|105->77|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|110->82|111->83|111->83|111->83|112->84|113->85|113->85|113->85|116->88|117->89|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|119->91|120->92|120->92|120->92|120->92|120->92|120->92|122->94|122->94|122->94|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|129->101
                    -- GENERATED --
                */
            