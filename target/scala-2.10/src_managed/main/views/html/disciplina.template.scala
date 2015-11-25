
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
object disciplina extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Disciplina],Disciplina,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(disciplinas: List[Disciplina])(disciplinaAtual: Disciplina)(erro: Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.77*/("""

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
            		"""),_display_(Seq[Any](/*57.16*/if(erro == true)/*57.32*/{_display_(Seq[Any](format.raw/*57.33*/("""
            			<div class="uk-alert uk-alert-warning" data-uk-alert>
	            			<a href="" class="uk-alert-close uk-close"></a>
	            			<p>Não foi possível completar a sua indicação. (Selecione pelo menos uma dica ou uma indicação)</p>
            			</div>
            		""")))})),format.raw/*62.16*/("""
            		<div class="uk-panel uk-panel-box">
            			<div class="uk-article">
	            				<h2>Dicas indicadas</h2>
            				<div>
            					<div class="uk-align-right">
            						<button class="uk-button uk-button-primary uk-button uk-align-right" data-uk-modal=""""),format.raw/*68.103*/("""{"""),format.raw/*68.104*/("""target:'#add-metadica-modal'"""),format.raw/*68.132*/("""}"""),format.raw/*68.133*/(""""><i class="uk-icon-list"></i> Indicar dicas
            						</button>
            					</div>
	            			</div>
            				<hr class="uk-article-divider-orange">
            			</div>
            			<div id="dicasList">
            				"""),_display_(Seq[Any](/*75.18*/if(disciplinaAtual.getMetaDicas().isEmpty())/*75.62*/{_display_(Seq[Any](format.raw/*75.63*/("""
								<p>Esta disciplina ainda não possui nenhuma indicação.</p>
							""")))})),format.raw/*77.9*/("""
	            			"""),_display_(Seq[Any](/*78.18*/for(metadica <- disciplinaAtual.getMetaDicas()) yield /*78.65*/{_display_(Seq[Any](format.raw/*78.66*/("""
	            			<div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*79.76*/("""{"""),format.raw/*79.77*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*79.114*/("""}"""),format.raw/*79.115*/("""">
            					"""),_display_(Seq[Any](/*80.19*/if(!metadica.wasFlaggedByUser(session.get("login")))/*80.71*/{_display_(Seq[Any](format.raw/*80.72*/("""
	            					<form name="formDenunciarMeta"""),_display_(Seq[Any](/*81.49*/metadica/*81.57*/.getId())),format.raw/*81.65*/("""" method="post" action="/denunciarMetaDica/"""),_display_(Seq[Any](/*81.109*/metadica/*81.117*/.getId())),format.raw/*81.125*/(""""></form>
	            					<a data-uk-tooltip title="Denunciar" 
	            						class="uk-text-warning uk-icon-hover uk-icon-flag uk-panel-badge" href="javascript:denunciarMetaDica("""),_display_(Seq[Any](/*83.122*/metadica/*83.130*/.getId())),format.raw/*83.138*/(""")"></a>
	            				""")))})),format.raw/*84.19*/("""
            					<p>Comentário: </p><p class="normal-font">"""),_display_(Seq[Any](/*85.61*/metadica/*85.69*/.getComment())),format.raw/*85.82*/("""</p>
	            				<p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*86.64*/metadica/*86.72*/.getUser())),format.raw/*86.82*/("""</p>
            					<a href="/metadica/"""),_display_(Seq[Any](/*87.38*/metadica/*87.46*/.getId())),format.raw/*87.54*/(""""><i class="uk-icon-plus"></i> Mostrar dicas</a>
	            				<hr class="uk-article-divider-orange">
	            				<div class="uk-grid center">
	            					<div class="uk-width-small-1-3">
	            						<span class="normal-font">Avaliação:</span> """),_display_(Seq[Any](/*91.65*/metadica/*91.73*/.getIndiceConcordancia())),format.raw/*91.97*/("""
		            				</div>
		            				<div class="uk-width-small-1-3">
		            					<span class="normal-font">Avalie:</span>
		            					"""),_display_(Seq[Any](/*95.21*/if(!metadica.wasVotedByUser(session.get("login")) && !metadica.isUnvotable())/*95.98*/{_display_(Seq[Any](format.raw/*95.99*/("""
		            						<form name="formUpVote"""),_display_(Seq[Any](/*96.44*/metadica/*96.52*/.getId())),format.raw/*96.60*/("""" method="post" action="/upVoteMetaDica/"""),_display_(Seq[Any](/*96.101*/metadica/*96.109*/.getId())),format.raw/*96.117*/(""""></form>
			            					<a class="uk-icon-hover uk-icon-thumbs-up uk-text-success" href="javascript:DoPost("""),_display_(Seq[Any](/*97.105*/metadica/*97.113*/.getId())),format.raw/*97.121*/(""")"></a>
			            					<a class="uk-icon-hover uk-icon-thumbs-down uk-text-success" 
			            						data-uk-modal=""""),format.raw/*99.37*/("""{"""),format.raw/*99.38*/("""target:'#metadica-add-discordancia-modal-"""),_display_(Seq[Any](/*99.80*/metadica/*99.88*/.getId())),format.raw/*99.96*/("""'"""),format.raw/*99.97*/("""}"""),format.raw/*99.98*/(""""></a>
		            					""")))}/*100.22*/else/*100.27*/{_display_(Seq[Any](format.raw/*100.28*/("""
		            						<i class="uk-icon-hover uk-icon-thumbs-up"></i>
		            						<i class="uk-icon-hover uk-icon-thumbs-down"></i>
		            					""")))})),format.raw/*103.21*/("""
		            				</div>
		            				<div class="uk-width-small-1-3">
		            					<span class="normal-font">Discordâncias:</span>
		            					<a class="uk-icon-hover uk-icon-comments-o uk-text-success"
		            						data-uk-modal=""""),format.raw/*108.36*/("""{"""),format.raw/*108.37*/("""target:'#metadica-discordancias-modal-"""),_display_(Seq[Any](/*108.76*/metadica/*108.84*/.getId())),format.raw/*108.92*/("""'"""),format.raw/*108.93*/("""}"""),format.raw/*108.94*/(""""></a>
		            				</div>
	            				</div>
	            			</div>
	            			<hr class="uk-article-divider">
	            				<!-- ---------------- MODAL DISCORDÂNCIAS ---------------- -->
		            			<div id="metadica-discordancias-modal-"""),_display_(Seq[Any](/*114.57*/metadica/*114.65*/.getId())),format.raw/*114.73*/("""" class="uk-modal">
									<div class="uk-modal-dialog">
										<a class="uk-modal-close uk-close"></a>
										<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Discordâncias</h2></div>
										<div class="uk-overflow-container">
										"""),_display_(Seq[Any](/*119.12*/if(metadica.getUsersCommentaries().entrySet().isEmpty())/*119.68*/{_display_(Seq[Any](format.raw/*119.69*/("""
											<p>Nenhuma discordância adicionada.</p>
										""")))})),format.raw/*121.12*/("""
										"""),_display_(Seq[Any](/*122.12*/for(discordancia <- metadica.getUsersCommentaries().entrySet()) yield /*122.75*/{_display_(Seq[Any](format.raw/*122.76*/("""
		            						<div class="uk-panel uk-panel-box dica">
				            					<p class="normal-font">"""),_display_(Seq[Any](/*124.46*/discordancia/*124.58*/.getValue())),format.raw/*124.69*/("""</p>
					            				<p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*125.68*/discordancia/*125.80*/.getKey())),format.raw/*125.89*/("""</p>
				            				</div>
				            				<hr class="uk-article-divider">
				            			""")))})),format.raw/*128.21*/("""
				            			</div>
				            		</div>
				            	</div>
				            	<!-- ---------------- MODAL ADD DISCORDÂNCIA ---------------- -->
				            	<div id="metadica-add-discordancia-modal-"""),_display_(Seq[Any](/*133.60*/metadica/*133.68*/.getId())),format.raw/*133.76*/("""" class="uk-modal">
									<div class="uk-modal-dialog">
										<a class="uk-modal-close uk-close"></a>
										<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
										<div class="uk-container uk-container-center">
											<form class="uk-form center" method="post" action="/addDiscordanciaMeta/"""),_display_(Seq[Any](/*138.85*/metadica/*138.93*/.getId())),format.raw/*138.101*/("""">
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
								<!-- ---------------- FIM MODAL ---------------- -->
	            			""")))})),format.raw/*150.18*/("""
	            		</div>
            		</div>
            	</div>
            </div>
        </div>
        <div id="add-metadica-modal" class="uk-modal">
			<div class="uk-modal-dialog">
				<a class="uk-modal-close uk-close"></a>
				<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Indicar dicas</h2></div>
				<form class="uk-form" method="post" action="/cadastrarMetaDica/"""),_display_(Seq[Any](/*160.69*/disciplinaAtual/*160.84*/.getId())),format.raw/*160.92*/("""">
					<div class="center">
						<p>Escreva um comentário e selecione as dicas que deseja indicar.</p>
						<textarea cols="70" rows="5" name="comentario" ng-model="comentario"
								class="form-control" required>Comentário.</textarea>
			       		<hr class="uk-article-divider-orange">
			       	</div>
					<div class="uk-overflow-container">
					"""),_display_(Seq[Any](/*168.7*/for(tema <- disciplinaAtual.getTemas()) yield /*168.46*/{_display_(Seq[Any](format.raw/*168.47*/("""
						"""),_display_(Seq[Any](/*169.8*/for(dica <- tema.getDicas()) yield /*169.36*/{_display_(Seq[Any](format.raw/*169.37*/("""
							<div class="uk-panel uk-panel-box dica">
								<input class="uk-form-control uk-panel-badge" type="checkbox" name="dica" value=""""),_display_(Seq[Any](/*171.91*/dica/*171.95*/.getId())),format.raw/*171.103*/("""">
								"""),_display_(Seq[Any](/*172.10*/if(dica.getTipo().equals("DicaDisciplina"))/*172.53*/{_display_(Seq[Any](format.raw/*172.54*/("""
	            					<p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*173.74*/dica/*173.78*/.getTexto())),format.raw/*173.89*/("""</p>
	            					<p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*174.56*/dica/*174.60*/.getInstanciaDisciplina.getRazao())),format.raw/*174.94*/("""</p>
	            				""")))})),format.raw/*175.19*/("""
	            				"""),_display_(Seq[Any](/*176.19*/if(dica.getTipo().equals("DicaMaterial"))/*176.60*/{_display_(Seq[Any](format.raw/*176.61*/("""
	            					<p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*177.60*/dica/*177.64*/.getTexto())),format.raw/*177.75*/("""">"""),_display_(Seq[Any](/*177.78*/dica/*177.82*/.getTexto())),format.raw/*177.93*/("""</a>
	            				""")))})),format.raw/*178.19*/("""
	            				"""),_display_(Seq[Any](/*179.19*/if(dica.getTipo().equals("DicaConselho"))/*179.60*/{_display_(Seq[Any](format.raw/*179.61*/("""
	            					<p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*180.59*/dica/*180.63*/.getTexto())),format.raw/*180.74*/("""</p>
	            				""")))})),format.raw/*181.19*/("""
	            				"""),_display_(Seq[Any](/*182.19*/if(dica.getTipo().equals("DicaAssunto"))/*182.59*/{_display_(Seq[Any](format.raw/*182.60*/("""
	            					<p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*183.71*/dica/*183.75*/.getTexto())),format.raw/*183.86*/("""</p>
	            				""")))})),format.raw/*184.19*/("""
		       				</div>
		       				<hr class="uk-article-divider">
	       				""")))})),format.raw/*187.14*/("""
		         	""")))})),format.raw/*188.14*/("""
       				"""),_display_(Seq[Any](/*189.13*/for(metadica <- disciplinaAtual.getMetaDicas()) yield /*189.60*/{_display_(Seq[Any](format.raw/*189.61*/("""
       					<div class="uk-panel uk-panel-box dica" style="background-color: #34363f;">
							<input class="uk-form-control uk-panel-badge" type="checkbox" name="metadica" value=""""),_display_(Seq[Any](/*191.94*/metadica/*191.102*/.getId())),format.raw/*191.110*/("""">
							<p>Comentário: </p><p class="normal-font">"""),_display_(Seq[Any](/*192.51*/metadica/*192.59*/.getComment())),format.raw/*192.72*/("""</p>
						</div>
	       				<hr class="uk-article-divider">
       				""")))})),format.raw/*195.13*/("""
       				</div>
	         	<div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
					<button class="uk-button uk-button-primary" type="submit" ng-disabled="!comentario">Indicar</button>
				</div>
	         	</form>
			</div>
		</div>
    </body>
</html>
"""))}
    }
    
    def render(disciplinas:List[Disciplina],disciplinaAtual:Disciplina,erro:Boolean): play.api.templates.HtmlFormat.Appendable = apply(disciplinas)(disciplinaAtual)(erro)
    
    def f:((List[Disciplina]) => (Disciplina) => (Boolean) => play.api.templates.HtmlFormat.Appendable) = (disciplinas) => (disciplinaAtual) => (erro) => apply(disciplinas)(disciplinaAtual)(erro)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 25 10:37:00 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master/app/views/disciplina.scala.html
                    HASH: f23fdd91547cf21afc55ff70e4238dc4fdd528b9
                    MATRIX: 808->1|977->76|1206->270|1220->276|1275->310|1367->366|1382->372|1454->421|1551->482|1566->488|1620->520|1776->640|1791->646|1847->680|1940->737|1955->743|2024->790|2117->847|2132->853|2194->893|2287->950|2302->956|2357->989|2610->1206|2626->1213|2664->1229|2866->1395|2881->1401|2932->1430|3536->1999|3582->2029|3621->2030|3676->2049|3734->2098|3773->2099|3886->2176|3905->2186|3935->2194|3974->2197|3994->2207|4027->2217|4074->2246|4087->2251|4126->2252|4229->2319|4248->2329|4278->2337|4317->2340|4336->2350|4369->2360|4429->2388|4484->2407|4534->2441|4573->2442|4666->2499|4679->2503|4709->2511|4748->2514|4761->2518|4793->2528|4844->2547|4921->2593|5151->2787|5176->2803|5215->2804|5534->3091|5866->3394|5896->3395|5953->3423|5983->3424|6269->3674|6322->3718|6361->3719|6468->3795|6522->3813|6585->3860|6624->3861|6728->3937|6757->3938|6823->3975|6853->3976|6910->3997|6971->4049|7010->4050|7095->4099|7112->4107|7142->4115|7223->4159|7241->4167|7272->4175|7496->4362|7514->4370|7545->4378|7603->4404|7700->4465|7717->4473|7752->4486|7856->4554|7873->4562|7905->4572|7983->4614|8000->4622|8030->4630|8332->4896|8349->4904|8395->4928|8588->5085|8674->5162|8713->5163|8793->5207|8810->5215|8840->5223|8918->5264|8936->5272|8967->5280|9118->5394|9136->5402|9167->5410|9321->5536|9350->5537|9428->5579|9445->5587|9475->5595|9504->5596|9533->5597|9580->5625|9594->5630|9634->5631|9826->5790|10113->6048|10143->6049|10219->6088|10237->6096|10268->6104|10298->6105|10328->6106|10628->6369|10646->6377|10677->6385|10981->6652|11047->6708|11087->6709|11183->6772|11232->6784|11312->6847|11352->6848|11496->6955|11518->6967|11552->6978|11661->7050|11683->7062|11715->7071|11852->7175|12107->7393|12125->7401|12156->7409|12545->7761|12563->7769|12595->7777|13208->8357|13638->8750|13663->8765|13694->8773|14087->9130|14143->9169|14183->9170|14227->9178|14272->9206|14312->9207|14488->9346|14502->9350|14534->9358|14583->9370|14636->9413|14676->9414|14787->9488|14801->9492|14835->9503|14932->9563|14946->9567|15003->9601|15059->9624|15115->9643|15166->9684|15206->9685|15303->9745|15317->9749|15351->9760|15391->9763|15405->9767|15439->9778|15495->9801|15551->9820|15602->9861|15642->9862|15738->9921|15752->9925|15786->9936|15842->9959|15898->9978|15948->10018|15988->10019|16096->10090|16110->10094|16144->10105|16200->10128|16312->10207|16359->10221|16409->10234|16473->10281|16513->10282|16732->10464|16751->10472|16783->10480|16873->10533|16891->10541|16927->10554|17034->10628
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|54->26|54->26|54->26|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|77->49|79->51|85->57|85->57|85->57|90->62|96->68|96->68|96->68|96->68|103->75|103->75|103->75|105->77|106->78|106->78|106->78|107->79|107->79|107->79|107->79|108->80|108->80|108->80|109->81|109->81|109->81|109->81|109->81|109->81|111->83|111->83|111->83|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|115->87|115->87|119->91|119->91|119->91|123->95|123->95|123->95|124->96|124->96|124->96|124->96|124->96|124->96|125->97|125->97|125->97|127->99|127->99|127->99|127->99|127->99|127->99|127->99|128->100|128->100|128->100|131->103|136->108|136->108|136->108|136->108|136->108|136->108|136->108|142->114|142->114|142->114|147->119|147->119|147->119|149->121|150->122|150->122|150->122|152->124|152->124|152->124|153->125|153->125|153->125|156->128|161->133|161->133|161->133|166->138|166->138|166->138|178->150|188->160|188->160|188->160|196->168|196->168|196->168|197->169|197->169|197->169|199->171|199->171|199->171|200->172|200->172|200->172|201->173|201->173|201->173|202->174|202->174|202->174|203->175|204->176|204->176|204->176|205->177|205->177|205->177|205->177|205->177|205->177|206->178|207->179|207->179|207->179|208->180|208->180|208->180|209->181|210->182|210->182|210->182|211->183|211->183|211->183|212->184|215->187|216->188|217->189|217->189|217->189|219->191|219->191|219->191|220->192|220->192|220->192|223->195
                    -- GENERATED --
                */
            