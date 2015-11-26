
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
                    DATE: Thu Nov 26 20:59:02 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master22/portaldoleite-master/app/views/metadica.scala.html
                    HASH: dc6525f320b307ea46c2fafceca98bb2d1cd974e
                    MATRIX: 807->1|986->86|1223->288|1237->294|1292->328|1385->385|1400->391|1472->440|1570->502|1585->508|1639->540|1797->662|1812->668|1868->702|1962->760|1977->766|2046->813|2140->871|2155->877|2217->917|2311->975|2326->981|2381->1014|2640->1237|2656->1244|2694->1260|2900->1430|2915->1436|2966->1465|3585->2049|3631->2079|3670->2080|3726->2100|3784->2149|3823->2150|3937->2228|3956->2238|3986->2246|4025->2249|4045->2259|4078->2269|4126->2299|4139->2304|4178->2305|4282->2373|4301->2383|4331->2391|4370->2394|4389->2404|4422->2414|4483->2443|4539->2463|4589->2497|4628->2498|4722->2556|4735->2560|4765->2568|4804->2571|4817->2575|4849->2585|4901->2605|4980->2653|5516->3153|5580->3201|5619->3202|5724->3279|5753->3280|5819->3317|5849->3318|5907->3340|5964->3388|6003->3389|6085->3435|6098->3439|6128->3447|6204->3487|6218->3491|6249->3499|6471->3684|6485->3688|6516->3696|6575->3723|6631->3743|6683->3786|6722->3787|6833->3862|6846->3866|6879->3877|6976->3938|6989->3942|7045->3976|7101->4000|7157->4020|7207->4061|7246->4062|7343->4123|7356->4127|7389->4138|7428->4141|7441->4145|7474->4156|7530->4180|7586->4200|7636->4241|7675->4242|7771->4302|7784->4306|7817->4317|7873->4341|7929->4361|7978->4401|8017->4402|8125->4474|8138->4478|8171->4489|8227->4513|8328->4578|8341->4582|8373->4592|8501->4688|8556->4707|8628->4763|8667->4764|8772->4841|8801->4842|8867->4879|8897->4880|8955->4902|9016->4954|9055->4955|9141->5005|9158->5013|9188->5021|9269->5065|9287->5073|9318->5081|9544->5270|9562->5278|9593->5286|9652->5313|9750->5375|9767->5383|9802->5396|9907->5465|9924->5473|9956->5483|10035->5526|10052->5534|10082->5542|10255->5682
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|54->26|54->26|54->26|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|77->49|79->51|93->65|93->65|93->65|94->66|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|96->68|96->68|96->68|98->70|98->70|98->70|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|103->75|104->76|104->76|104->76|105->77|105->77|105->77|105->77|105->77|105->77|106->78|107->79|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|110->82|111->83|111->83|111->83|112->84|113->85|113->85|113->85|116->88|117->89|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|119->91|120->92|120->92|120->92|120->92|120->92|120->92|122->94|122->94|122->94|123->95|124->96|124->96|124->96|125->97|125->97|125->97|126->98|126->98|126->98|129->101
                    -- GENERATED --
                */
            