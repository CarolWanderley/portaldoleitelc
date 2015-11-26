
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
object tema extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Disciplina],Tema,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(disciplinas: List[Disciplina])(temaAtual: Tema):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.50*/("""

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
            				<li class="uk-nav-header"><a href="/disciplina/"""),_display_(Seq[Any](/*42.65*/disciplina/*42.75*/.getId())),format.raw/*42.83*/("""">"""),_display_(Seq[Any](/*42.86*/disciplina/*42.96*/.getNome())),format.raw/*42.106*/("""</a></li>
            					"""),_display_(Seq[Any](/*43.19*/for(tema <- disciplina.getTemas()) yield /*43.53*/{_display_(Seq[Any](format.raw/*43.54*/("""
            						"""),_display_(Seq[Any](/*44.20*/if(tema.getId() == temaAtual.getId())/*44.57*/{_display_(Seq[Any](format.raw/*44.58*/("""
            							<li class="uk-active"><a href="/tema/"""),_display_(Seq[Any](/*45.58*/tema/*45.62*/.getId())),format.raw/*45.70*/("""">"""),_display_(Seq[Any](/*45.73*/tema/*45.77*/.getName())),format.raw/*45.87*/("""</a></li>
            						""")))}/*46.20*/else/*46.24*/{_display_(Seq[Any](format.raw/*46.25*/("""
            							<li class="uk-parent"><a href="/tema/"""),_display_(Seq[Any](/*47.58*/tema/*47.62*/.getId())),format.raw/*47.70*/("""">"""),_display_(Seq[Any](/*47.73*/tema/*47.77*/.getName())),format.raw/*47.87*/("""</a></li>
            						""")))})),format.raw/*48.20*/("""
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
	            				<h2>Dicas</h2>
            				<div>
            					<a class="uk-article-meta uk-text-success" data-uk-modal=""""),format.raw/*61.76*/("""{"""),format.raw/*61.77*/("""target:'#avaliacao-modal'"""),format.raw/*61.102*/("""}"""),format.raw/*61.103*/("""">
            					Informações sobre <strong>""""),_display_(Seq[Any](/*62.46*/temaAtual/*62.55*/.getName())),format.raw/*62.65*/("""" <i class="uk-icon-hover uk-icon-info-circle"></i></a>
            					<div class="uk-button-dropdown uk-align-right" data-uk-dropdown=""""),format.raw/*63.83*/("""{"""),format.raw/*63.84*/("""mode:'click'"""),format.raw/*63.96*/("""}"""),format.raw/*63.97*/("""">
            						<button class="uk-button uk-button-primary uk-button uk-align-right"><i class="uk-icon-plus"></i> Adicionar dica
            						<i class="uk-icon-caret-down"></i>
            						</button>
            						<div class="uk-dropdown">
            							<ul class="uk-nav uk-nav-dropdown uk-text-center">
                                            <li class="uk-nav-header">ESCOLHA UM TIPO</li>
                                            <li class="uk-nav-divider"></li>
                                            <li><a data-uk-modal=""""),format.raw/*71.67*/("""{"""),format.raw/*71.68*/("""target:'#dica-assunto-modal'"""),format.raw/*71.96*/("""}"""),format.raw/*71.97*/("""">Assunto</a></li>
                                            <li><a data-uk-modal=""""),format.raw/*72.67*/("""{"""),format.raw/*72.68*/("""target:'#dica-disciplina-modal'"""),format.raw/*72.99*/("""}"""),format.raw/*72.100*/("""">Disciplinas</a></li>
                                            <li><a data-uk-modal=""""),format.raw/*73.67*/("""{"""),format.raw/*73.68*/("""target:'#dica-material-modal'"""),format.raw/*73.97*/("""}"""),format.raw/*73.98*/("""">Material (link)</a></li>
                                            <li><a data-uk-modal=""""),format.raw/*74.67*/("""{"""),format.raw/*74.68*/("""target:'#dica-conselho-modal'"""),format.raw/*74.97*/("""}"""),format.raw/*74.98*/("""">Conselho</a></li>
                                        </ul>
            						</div>
            					</div>
	            			</div>
            				<hr class="uk-article-divider-orange">
            			</div>
            			<div id="dicasList">
            				"""),_display_(Seq[Any](/*82.18*/if(temaAtual.getDicas().isEmpty())/*82.52*/{_display_(Seq[Any](format.raw/*82.53*/("""
								<p>Este tema ainda não possui nenhuma dica.</p>
							""")))})),format.raw/*84.9*/("""
	            			"""),_display_(Seq[Any](/*85.18*/for(dica <- temaAtual.getDicas()) yield /*85.51*/{_display_(Seq[Any](format.raw/*85.52*/("""
	            			<div class="uk-panel uk-panel-box dica" data-uk-scrollspy=""""),format.raw/*86.76*/("""{"""),format.raw/*86.77*/("""cls:'uk-animation-fade', repeat: true"""),format.raw/*86.114*/("""}"""),format.raw/*86.115*/("""">
	            				"""),_display_(Seq[Any](/*87.19*/if(!dica.wasFlaggedByUser(session.get("login")))/*87.67*/{_display_(Seq[Any](format.raw/*87.68*/("""
	            					<form name="formDenunciar"""),_display_(Seq[Any](/*88.45*/dica/*88.49*/.getId())),format.raw/*88.57*/("""" method="post" action="/denunciarDica/"""),_display_(Seq[Any](/*88.97*/dica/*88.101*/.getId())),format.raw/*88.109*/(""""></form>
	            					<a data-uk-tooltip title="Denunciar dica" 
	            						class="uk-text-warning uk-icon-hover uk-icon-flag uk-panel-badge" href="javascript:denunciarDica("""),_display_(Seq[Any](/*90.118*/dica/*90.122*/.getId())),format.raw/*90.130*/(""")"></a>
	            				""")))})),format.raw/*91.19*/("""
	            				"""),_display_(Seq[Any](/*92.19*/if(dica.getTipo().equals("DicaDisciplina"))/*92.62*/{_display_(Seq[Any](format.raw/*92.63*/("""
	            					<p>Disciplinas importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*93.74*/dica/*93.78*/.getTexto())),format.raw/*93.89*/("""</p>
	            					<p>Razão:</p><p class="normal-font">"""),_display_(Seq[Any](/*94.56*/dica/*94.60*/.getInstanciaDisciplina.getRazao())),format.raw/*94.94*/("""</p>
	            				""")))})),format.raw/*95.19*/("""
	            				"""),_display_(Seq[Any](/*96.19*/if(dica.getTipo().equals("DicaMaterial"))/*96.60*/{_display_(Seq[Any](format.raw/*96.61*/("""
	            					<p>Link para material útil:</p><a href=""""),_display_(Seq[Any](/*97.60*/dica/*97.64*/.getTexto())),format.raw/*97.75*/("""">"""),_display_(Seq[Any](/*97.78*/dica/*97.82*/.getTexto())),format.raw/*97.93*/("""</a>
	            				""")))})),format.raw/*98.19*/("""
	            				"""),_display_(Seq[Any](/*99.19*/if(dica.getTipo().equals("DicaConselho"))/*99.60*/{_display_(Seq[Any](format.raw/*99.61*/("""
	            					<p>Conselho:</p><p class="normal-font">"""),_display_(Seq[Any](/*100.59*/dica/*100.63*/.getTexto())),format.raw/*100.74*/("""</p>
	            				""")))})),format.raw/*101.19*/("""
	            				"""),_display_(Seq[Any](/*102.19*/if(dica.getTipo().equals("DicaAssunto"))/*102.59*/{_display_(Seq[Any](format.raw/*102.60*/("""
	            					<p>Assuntos importantes:</p><p class="normal-font">"""),_display_(Seq[Any](/*103.71*/dica/*103.75*/.getTexto())),format.raw/*103.86*/("""</p>
	            				""")))})),format.raw/*104.19*/("""
	            				
	            				<p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*106.64*/dica/*106.68*/.getUser())),format.raw/*106.78*/("""</p>
	            				<hr class="uk-article-divider-orange">
	            				<div class="uk-grid center">
	            					<div class="uk-width-small-1-3">
	            						<span class="normal-font">Avaliação:</span> """),_display_(Seq[Any](/*110.65*/dica/*110.69*/.getIndiceConcordancia())),format.raw/*110.93*/("""
		            				</div>
		            				<div class="uk-width-small-1-3">
		            					<span class="normal-font">Avalie:</span>
		            					"""),_display_(Seq[Any](/*114.21*/if(!dica.wasVotedByUser(session.get("login")) && !dica.isUnvotable())/*114.90*/{_display_(Seq[Any](format.raw/*114.91*/("""
		            						<form name="formUpVote"""),_display_(Seq[Any](/*115.44*/dica/*115.48*/.getId())),format.raw/*115.56*/("""" method="post" action="/upVoteDica/"""),_display_(Seq[Any](/*115.93*/dica/*115.97*/.getId())),format.raw/*115.105*/(""""></form>
			            					<a class="uk-icon-hover uk-icon-thumbs-up uk-text-success" href="javascript:DoPost("""),_display_(Seq[Any](/*116.105*/dica/*116.109*/.getId())),format.raw/*116.117*/(""")"></a>
			            					<a class="uk-icon-hover uk-icon-thumbs-down uk-text-success" 
			            						data-uk-modal=""""),format.raw/*118.37*/("""{"""),format.raw/*118.38*/("""target:'#dica-add-discordancia-modal-"""),_display_(Seq[Any](/*118.76*/dica/*118.80*/.getId())),format.raw/*118.88*/("""'"""),format.raw/*118.89*/("""}"""),format.raw/*118.90*/(""""></a>
		            					""")))}/*119.22*/else/*119.27*/{_display_(Seq[Any](format.raw/*119.28*/("""
		            						<i class="uk-icon-hover uk-icon-thumbs-up"></i>
		            						<i class="uk-icon-hover uk-icon-thumbs-down"></i>
		            					""")))})),format.raw/*122.21*/("""
		            				</div>
		            				<div class="uk-width-small-1-3">
		            					<span class="normal-font">Discordâncias:</span>
		            					<a class="uk-icon-hover uk-icon-comments-o uk-text-success"
		            						data-uk-modal=""""),format.raw/*127.36*/("""{"""),format.raw/*127.37*/("""target:'#dica-discordancias-modal-"""),_display_(Seq[Any](/*127.72*/dica/*127.76*/.getId())),format.raw/*127.84*/("""'"""),format.raw/*127.85*/("""}"""),format.raw/*127.86*/(""""></a>
		            				</div>
	            				</div>
	            			</div>
	            			<hr class="uk-article-divider">
	            				<!---------------- MODAL DISCORDÂNCIAS ---------------->
		            			<div id="dica-discordancias-modal-"""),_display_(Seq[Any](/*133.53*/dica/*133.57*/.getId())),format.raw/*133.65*/("""" class="uk-modal">
									<div class="uk-modal-dialog">
										<a class="uk-modal-close uk-close"></a>
										<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Discordâncias</h2></div>
										<div class="uk-overflow-container">
										"""),_display_(Seq[Any](/*138.12*/if(dica.getUsersCommentaries().entrySet().isEmpty())/*138.64*/{_display_(Seq[Any](format.raw/*138.65*/("""
											<p>Nenhuma discordância adicionada.</p>
										""")))})),format.raw/*140.12*/("""
										"""),_display_(Seq[Any](/*141.12*/for(discordancia <- dica.getUsersCommentaries().entrySet()) yield /*141.71*/{_display_(Seq[Any](format.raw/*141.72*/("""
		            						<div class="uk-panel uk-panel-box dica">
				            					<p class="normal-font">"""),_display_(Seq[Any](/*143.46*/discordancia/*143.58*/.getValue())),format.raw/*143.69*/("""</p>
					            				<p class="uk-article-meta uk-text-right">por """),_display_(Seq[Any](/*144.68*/discordancia/*144.80*/.getKey())),format.raw/*144.89*/("""</p>
				            				</div>
				            				<hr class="uk-article-divider">
				            			""")))})),format.raw/*147.21*/("""
				            			</div>
				            		</div>
				            	</div>
				            	<!---------------- MODAL ADD DISCORDÂNCIA ---------------->
				            	<div id="dica-add-discordancia-modal-"""),_display_(Seq[Any](/*152.56*/dica/*152.60*/.getId())),format.raw/*152.68*/("""" class="uk-modal">
									<div class="uk-modal-dialog">
										<a class="uk-modal-close uk-close"></a>
										<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
										<div class="uk-container uk-container-center">
											<form class="uk-form center" method="post" action="/addDiscordancia/"""),_display_(Seq[Any](/*157.81*/dica/*157.85*/.getId())),format.raw/*157.93*/("""">
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
	            			""")))})),format.raw/*169.18*/("""
	            		</div>
            		</div>
            	</div>
            </div>
        </div>
        <div id="avaliacao-modal" class="uk-modal">
        	<div class="uk-modal-dialog">
	        	<a class="uk-modal-close uk-close"></a>
				<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Avaliação da dificuldade de """"),_display_(Seq[Any](/*178.101*/temaAtual/*178.110*/.getName())),format.raw/*178.120*/(""""</h2></div>
				<div class="uk-article">
					<h3 class="uk-h3">Dificuldade do tema</h3>
					<p class="normal-font">Média: """),_display_(Seq[Any](/*181.37*/temaAtual/*181.46*/.getMedia())),format.raw/*181.57*/("""</p>
					<p class="normal-font">Mediana: """),_display_(Seq[Any](/*182.39*/temaAtual/*182.48*/.getMediana())),format.raw/*182.61*/("""</p>
					<hr class="uk-article-divider-orange">
					<form class="uk-form" method="post" action="/avaliar/"""),_display_(Seq[Any](/*184.60*/temaAtual/*184.69*/.getId())),format.raw/*184.77*/("""">
						<div class="uk-form-row">
							<p>Avalie a dificuldade deste tema:</p>
							<input list="valores" name="dificuldade" class="form-control" ng-model="valor">
							<datalist id="valores" class="form-control">
								<option value="-2">Muito fácil</option>
								<option value="-1">Fácil</option>
								<option value="0">Razoável</option>
								<option value="1">Difícil</option>
								<option value="2">Muito difícil</option>
							</datalist>
							<button class="uk-button uk-button-primary" type="submit" ng-disabled="!valor || valor < -2 || valor > 2">Enviar</button>
						</div>
					</form>
				</div>
			</div>
        </div>
        <div id="dica-assunto-modal" class="uk-modal">
			<div class="uk-modal-dialog">
				<a class="uk-modal-close uk-close"></a>
				<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
				<div class="uk-container uk-container-center">
					<form class="uk-form center" method="post" action="/cadastrarDica/"""),_display_(Seq[Any](/*206.73*/temaAtual/*206.82*/.getId())),format.raw/*206.90*/("""">
						<p>O que se deve saber para não ter dificuldades neste tema?</p>
						<input type="text" size="40" name="assunto" placeholder="Assunto" ng-model="assunto"
							class="form-control" required>
						<input type="hidden" name="tipo" value="assunto">
				</div>
						<div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
							<button class="uk-button uk-button-primary" type="submit" ng-disabled="!assunto">Adicionar</button>
						</div>
					</form>
			</div>
		</div>
        <div id="dica-disciplina-modal" class="uk-modal">
			<div class="uk-modal-dialog">
				<a class="uk-modal-close uk-close"></a>
				<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
				<div class="uk-container uk-container-center">
					<form class="uk-form center" method="post" action="/cadastrarDica/"""),_display_(Seq[Any](/*223.73*/temaAtual/*223.82*/.getId())),format.raw/*223.90*/("""">
						<p>Que disciplinas anteriores ajudarão a estudar este tema?</p>
						<input type="text" name="disciplinas" placeholder="Disciplinas" ng-model="disciplinas"
							size="60" class="form-control" required>
						<p>Por que?</p>
						<textarea cols="70" rows="5" name="razao" ng-model="justificativa"
							class="form-control" required>Justificativa.</textarea>
						<input type="hidden" name="tipo" value="disciplina">
				</div>
						<div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
							<button class="uk-button uk-button-primary" type="submit" ng-disabled="!disciplinas || !justificativa">Adicionar</button>
						</div>
					</form>
			</div>
		</div>
        <div id="dica-material-modal" class="uk-modal">
			<div class="uk-modal-dialog">
				<a class="uk-modal-close uk-close"></a>
				<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
				<div class="uk-container uk-container-center">
					<form class="uk-form center" method="post" action="/cadastrarDica/"""),_display_(Seq[Any](/*243.73*/temaAtual/*243.82*/.getId())),format.raw/*243.90*/("""">
						<p>Link para material útil relacionado a este tema:</p>
						<input type="url" size="60" name="url" placeholder="URL" ng-model="url"
							class="form-control" required>
						<input type="hidden" name="tipo" value="material">
				</div>
						<div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
							<button class="uk-button uk-button-primary" type="submit" ng-disabled="!url">Adicionar</button>
						</div>
					</form>
			</div>
		</div>
        <div id="dica-conselho-modal" class="uk-modal">
			<div class="uk-modal-dialog">
				<a class="uk-modal-close uk-close"></a>
				<div class="uk-modal-header" style="background-color:#5f5f5f"><h2>Adicionar dica</h2></div>
				<div class="uk-container uk-container-center">
					<form class="uk-form center" method="post" action="/cadastrarDica/"""),_display_(Seq[Any](/*260.73*/temaAtual/*260.82*/.getId())),format.raw/*260.90*/("""">
						<p>Conselho para quem quiser aprender este tema:</p>
						<textarea cols="70" rows="5" name="conselho" ng-model="conselho"
							class="form-control" required>Conselho.</textarea>
						<input type="hidden" name="tipo" value="conselho">
				</div>
						<div class="uk-modal-footer uk-text-right" style="background-color:#5f5f5f">
							<button class="uk-button uk-button-primary" type="submit" ng-disabled="!conselho">Adicionar</button>
						</div>
					</form>
			</div>
		</div>
    </body>
</html>
"""))}
    }
    
    def render(disciplinas:List[Disciplina],temaAtual:Tema): play.api.templates.HtmlFormat.Appendable = apply(disciplinas)(temaAtual)
    
    def f:((List[Disciplina]) => (Tema) => play.api.templates.HtmlFormat.Appendable) = (disciplinas) => (temaAtual) => apply(disciplinas)(temaAtual)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 26 20:59:03 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master22/portaldoleite-master/app/views/tema.scala.html
                    HASH: 40cde1b123ce1fa3f347cba96b47d44c5433de67
                    MATRIX: 788->1|930->49|1167->251|1181->257|1236->291|1329->348|1344->354|1416->403|1514->465|1529->471|1583->503|1741->625|1756->631|1812->665|1906->723|1921->729|1990->776|2084->834|2099->840|2161->880|2255->938|2270->944|2325->977|2584->1200|2600->1207|2638->1223|2844->1393|2859->1399|2910->1428|3529->2012|3575->2042|3614->2043|3716->2109|3735->2119|3765->2127|3804->2130|3823->2140|3856->2150|3921->2179|3971->2213|4010->2214|4067->2235|4113->2272|4152->2273|4247->2332|4260->2336|4290->2344|4329->2347|4342->2351|4374->2361|4423->2391|4436->2395|4475->2396|4570->2455|4583->2459|4613->2467|4652->2470|4665->2474|4697->2484|4759->2514|4802->2525|4881->2573|5317->2981|5346->2982|5400->3007|5430->3008|5515->3057|5533->3066|5565->3076|5732->3215|5761->3216|5801->3228|5830->3229|6429->3800|6458->3801|6514->3829|6543->3830|6657->3916|6686->3917|6745->3948|6775->3949|6893->4039|6922->4040|6979->4069|7008->4070|7130->4164|7159->4165|7216->4194|7245->4195|7557->4471|7600->4505|7639->4506|7737->4573|7792->4592|7841->4625|7880->4626|7985->4703|8014->4704|8080->4741|8110->4742|8168->4764|8225->4812|8264->4813|8346->4859|8359->4863|8389->4871|8465->4911|8479->4915|8510->4923|8737->5113|8751->5117|8782->5125|8841->5152|8897->5172|8949->5215|8988->5216|9099->5291|9112->5295|9145->5306|9242->5367|9255->5371|9311->5405|9367->5429|9423->5449|9473->5490|9512->5491|9609->5552|9622->5556|9655->5567|9694->5570|9707->5574|9740->5585|9796->5609|9852->5629|9902->5670|9941->5671|10038->5731|10052->5735|10086->5746|10143->5770|10200->5790|10250->5830|10290->5831|10399->5903|10413->5907|10447->5918|10504->5942|10625->6026|10639->6030|10672->6040|10935->6266|10949->6270|10996->6294|11194->6455|11273->6524|11313->6525|11395->6570|11409->6574|11440->6582|11514->6619|11528->6623|11560->6631|11713->6746|11728->6750|11760->6758|11917->6886|11947->6887|12022->6925|12036->6929|12067->6937|12097->6938|12127->6939|12175->6968|12189->6973|12229->6974|12424->7136|12716->7399|12746->7400|12818->7435|12832->7439|12863->7447|12893->7448|12923->7449|13219->7708|13233->7712|13264->7720|13573->7992|13635->8044|13675->8045|13773->8110|13823->8123|13899->8182|13939->8183|14085->8292|14107->8304|14141->8315|14251->8388|14273->8400|14305->8409|14445->8516|14695->8729|14709->8733|14740->8741|15130->9094|15144->9098|15175->9106|15794->9692|16180->10040|16200->10049|16234->10059|16400->10188|16419->10197|16453->10208|16534->10252|16553->10261|16589->10274|16736->10384|16755->10393|16786->10401|17853->11431|17872->11440|17903->11448|18816->12324|18835->12333|18866->12341|19974->13412|19993->13421|20024->13429|20910->14278|20929->14287|20960->14295
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|54->26|54->26|54->26|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|76->48|77->49|79->51|89->61|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|91->63|99->71|99->71|99->71|99->71|100->72|100->72|100->72|100->72|101->73|101->73|101->73|101->73|102->74|102->74|102->74|102->74|110->82|110->82|110->82|112->84|113->85|113->85|113->85|114->86|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|116->88|116->88|116->88|118->90|118->90|118->90|119->91|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|123->95|124->96|124->96|124->96|125->97|125->97|125->97|125->97|125->97|125->97|126->98|127->99|127->99|127->99|128->100|128->100|128->100|129->101|130->102|130->102|130->102|131->103|131->103|131->103|132->104|134->106|134->106|134->106|138->110|138->110|138->110|142->114|142->114|142->114|143->115|143->115|143->115|143->115|143->115|143->115|144->116|144->116|144->116|146->118|146->118|146->118|146->118|146->118|146->118|146->118|147->119|147->119|147->119|150->122|155->127|155->127|155->127|155->127|155->127|155->127|155->127|161->133|161->133|161->133|166->138|166->138|166->138|168->140|169->141|169->141|169->141|171->143|171->143|171->143|172->144|172->144|172->144|175->147|180->152|180->152|180->152|185->157|185->157|185->157|197->169|206->178|206->178|206->178|209->181|209->181|209->181|210->182|210->182|210->182|212->184|212->184|212->184|234->206|234->206|234->206|251->223|251->223|251->223|271->243|271->243|271->243|288->260|288->260|288->260
                    -- GENERATED --
                */
            