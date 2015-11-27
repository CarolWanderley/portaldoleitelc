
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
                    DATE: Fri Nov 27 00:29:36 BRST 2015
                    SOURCE: C:/Users/Luiza/Documents/portaldoleite-master22/portaldoleite-master/app/views/tema.scala.html
                    HASH: a6664152f8c21c69b7552aafd1b2a9e54697afd3
                    MATRIX: 788->1|930->49|1159->243|1173->249|1228->283|1320->339|1335->345|1407->394|1504->455|1519->461|1573->493|1729->613|1744->619|1800->653|1893->710|1908->716|1977->763|2070->820|2085->826|2147->866|2240->923|2255->929|2310->962|2563->1179|2579->1186|2617->1202|2819->1368|2834->1374|2885->1403|3489->1972|3535->2002|3574->2003|3675->2068|3694->2078|3724->2086|3763->2089|3782->2099|3815->2109|3879->2137|3929->2171|3968->2172|4024->2192|4070->2229|4109->2230|4203->2288|4216->2292|4246->2300|4285->2303|4298->2307|4330->2317|4378->2346|4391->2350|4430->2351|4524->2409|4537->2413|4567->2421|4606->2424|4619->2428|4651->2438|4712->2467|4754->2477|4831->2523|5257->2921|5286->2922|5340->2947|5370->2948|5454->2996|5472->3005|5504->3015|5670->3153|5699->3154|5739->3166|5768->3167|6359->3730|6388->3731|6444->3759|6473->3760|6586->3845|6615->3846|6674->3877|6704->3878|6821->3967|6850->3968|6907->3997|6936->3998|7057->4091|7086->4092|7143->4121|7172->4122|7476->4390|7519->4424|7558->4425|7654->4490|7708->4508|7757->4541|7796->4542|7900->4618|7929->4619|7995->4656|8025->4657|8082->4678|8139->4726|8178->4727|8259->4772|8272->4776|8302->4784|8378->4824|8392->4828|8423->4836|8648->5024|8662->5028|8693->5036|8751->5062|8806->5081|8858->5124|8897->5125|9007->5199|9020->5203|9053->5214|9149->5274|9162->5278|9218->5312|9273->5335|9328->5354|9378->5395|9417->5396|9513->5456|9526->5460|9559->5471|9598->5474|9611->5478|9644->5489|9699->5512|9754->5531|9804->5572|9843->5573|9939->5632|9953->5636|9987->5647|10043->5670|10099->5689|10149->5729|10189->5730|10297->5801|10311->5805|10345->5816|10401->5839|10520->5921|10534->5925|10567->5935|10826->6157|10840->6161|10887->6185|11081->6342|11160->6411|11200->6412|11281->6456|11295->6460|11326->6468|11400->6505|11414->6509|11446->6517|11598->6631|11613->6635|11645->6643|11800->6769|11830->6770|11905->6808|11919->6812|11950->6820|11980->6821|12010->6822|12057->6850|12071->6855|12111->6856|12303->7015|12590->7273|12620->7274|12692->7309|12706->7313|12737->7321|12767->7322|12797->7323|13087->7576|13101->7580|13132->7588|13436->7855|13498->7907|13538->7908|13634->7971|13683->7983|13759->8042|13799->8043|13943->8150|13965->8162|13999->8173|14108->8245|14130->8257|14162->8266|14299->8370|14544->8578|14558->8582|14589->8590|14974->8938|14988->8942|15019->8950|15626->9524|16003->9863|16023->9872|16057->9882|16220->10008|16239->10017|16273->10028|16353->10071|16372->10080|16408->10093|16553->10201|16572->10210|16603->10218|17648->11226|17667->11235|17698->11243|18594->12102|18613->12111|18644->12119|19732->13170|19751->13179|19782->13187|20651->14019|20670->14028|20701->14036
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|54->26|54->26|54->26|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|75->47|75->47|75->47|76->48|77->49|79->51|89->61|89->61|89->61|89->61|90->62|90->62|90->62|91->63|91->63|91->63|91->63|99->71|99->71|99->71|99->71|100->72|100->72|100->72|100->72|101->73|101->73|101->73|101->73|102->74|102->74|102->74|102->74|110->82|110->82|110->82|112->84|113->85|113->85|113->85|114->86|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|116->88|116->88|116->88|118->90|118->90|118->90|119->91|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94|123->95|124->96|124->96|124->96|125->97|125->97|125->97|125->97|125->97|125->97|126->98|127->99|127->99|127->99|128->100|128->100|128->100|129->101|130->102|130->102|130->102|131->103|131->103|131->103|132->104|134->106|134->106|134->106|138->110|138->110|138->110|142->114|142->114|142->114|143->115|143->115|143->115|143->115|143->115|143->115|144->116|144->116|144->116|146->118|146->118|146->118|146->118|146->118|146->118|146->118|147->119|147->119|147->119|150->122|155->127|155->127|155->127|155->127|155->127|155->127|155->127|161->133|161->133|161->133|166->138|166->138|166->138|168->140|169->141|169->141|169->141|171->143|171->143|171->143|172->144|172->144|172->144|175->147|180->152|180->152|180->152|185->157|185->157|185->157|197->169|206->178|206->178|206->178|209->181|209->181|209->181|210->182|210->182|210->182|212->184|212->184|212->184|234->206|234->206|234->206|251->223|251->223|251->223|271->243|271->243|271->243|288->260|288->260|288->260
                    -- GENERATED --
                */
            