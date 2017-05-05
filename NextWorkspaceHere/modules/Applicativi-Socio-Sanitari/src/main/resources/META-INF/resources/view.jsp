<%@ include file="/init.jsp" %>
<script type="text/javascript">

function HideS(idDett){
	var obj=document.getElementById(idDett);
	obj.style.display=(obj.style.display!='none')?'none':'';
}
</script>
<div style="height:300px; overflow:auto;">
<table>
	<tbody>
		<tr>
			<td>
			<table border="0" cellpadding="3" cellspacing="0">
				<tbody>
					<tr>
						<td><a href="http://curedomiciliari.aslmi1.mi.it/servizi/autorizzazioni/login_fase01.aspx?" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/cure_domiciliari.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></a></td>
						<td><a href="http://curedomiciliari.aslmi1.mi.it/servizi/autorizzazioni/login_fase01.aspx?" target="_blank"><b>CURE DOMICILIARI</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Servizio di assistenza utenti Help Desk</font></a></td>
					</tr>
					<tr>
						<td><a href="http://le-consul-00.aol.it:8080/SIT/jsp/login.jsp" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/consultori.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 32px;" /></a></td>
						<td><a href="http://le-consul-00.aol.it:8080/SIT/jsp/login.jsp" target="_blank"><b>CONSULTORI</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Gestione consultori</font></a></td>
					</tr>
					<tr>
						<td><a href="http://le-dipend-00.aol.it/mfp5web/mfp5menu.aspx" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/dipendenze.PNG" style="border-width: 0px; border-style: solid; width: 28px; height: 36px;" /></a></td>
						<td><a href="http://le-dipend-00.aol.it/mfp5web/mfp5menu.aspx" target="_blank"><b>DIPENDENZE</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Gestione dipendenze</font></a></td>
					</tr>
					<tr>
						<td><a href="http://le-visite-00.aol.it/DSPVisiteFiscali/" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/visite_fiscali.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></a></td>
						<td><a href="http://le-visite-00.aol.it/DSPVisiteFiscali/" target="_blank"><b>VISITE FISCALI</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Visite fiscali</font></a></td>
					</tr>
					<tr>
						<td><a href="https://trapianti.sanita.it/consensi/Pelogin.asp" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/consenso_trapianti.PNG" style="border-width: 0px; border-style: solid; width: 29px; height: 36px;" /></a></td>
						<td><a href="https://trapianti.sanita.it/consensi/Pelogin.asp" target="_blank"><b>CONSENSO TRAPIANTI</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Consenso trapianti</font></a></td>
					</tr>
					<tr>
						<td style="width: 36px;"><a href="https://nsis-ids.sanita.it/nidp/idff/sso?RequestID=id9-oX6NqrEIF6HpNxoa1J2Dt3k3M&amp;MajorVersion=1&amp;MinorVersion=2&amp;IssueInstant=2014-06-06T10%3A19%3A37Z&amp;ProviderID=https%3A%2F%2Fnsis.sanita.it%3A443%2Fnesp%2Fidff%2Fmetadata&amp;RelayState=MA%3D%3D&amp;consent=urn%3Aliberty%3Aconsent%3Aunavailable&amp;ForceAuthn=false&amp;IsPassive=false&amp;NameIDPolicy=onetime&amp;ProtocolProfile=http%3A%2F%2Fprojectliberty.org%2Fprofiles%2Fbrws-art&amp;target=https%3A%2F%2Fnsis.sanita.it%3A443%2F&amp;AuthnContextStatementRef=%2Furi%2Fanyauthentication" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/rimborsi_estero.PNG" style="border-width: 0px; border-style: solid; width: 30px; height: 36px;" /></a></td>
						<td><a href="https://nsis-ids.sanita.it/nidp/idff/sso?RequestID=id9-oX6NqrEIF6HpNxoa1J2Dt3k3M&amp;MajorVersion=1&amp;MinorVersion=2&amp;IssueInstant=2014-06-06T10%3A19%3A37Z&amp;ProviderID=https%3A%2F%2Fnsis.sanita.it%3A443%2Fnesp%2Fidff%2Fmetadata&amp;RelayState=MA%3D%3D&amp;consent=urn%3Aliberty%3Aconsent%3Aunavailable&amp;ForceAuthn=false&amp;IsPassive=false&amp;NameIDPolicy=onetime&amp;ProtocolProfile=http%3A%2F%2Fprojectliberty.org%2Fprofiles%2Fbrws-art&amp;target=https%3A%2F%2Fnsis.sanita.it%3A443%2F&amp;AuthnContextStatementRef=%2Furi%2Fanyauthentication" target="_blank"><b>RIMBORSI A.S. ESTERO</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Rimborsi assistenza sanitaria estero</font></a></td>
					</tr>
				</tbody>
			</table>
			</td>
			<td>
			<table border="0" cellpadding="3" cellspacing="0">
				<tbody>
					<tr onclick="HideS('dettaglioINPS')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/inps.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></td>
						<td><b>INPS</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Link INPS&gt;</font></td>
					</tr>
					<tr id="dettaglioINPS" style="display:none">
						<td>&nbsp;</td>
						<td>
						<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
							<tbody>
								<tr>
									<td><a href="https://servizi2.inps.it/servizi/Convenzioniicasl/Default.aspx" target="_blank">Consultazione revisioni</a></td>
								</tr>
								<tr>
									<td><a href="https://serviziweb2.inps.it/PassiWeb/jsp/login.jsp?uri=https%3a%2f%2fservizi2.inps.it%2fservizi%2fINVERInternet%2fdefault.aspx%3fS%3dS&amp;S=S" target="_blank">Verifiche straordinarie invalidità</a></td>
								</tr>
								<tr onclick="Apri('')">
									<td><a href="https://serviziweb2.inps.it/PassiWeb/jsp/login.jsp?uri=https%3a%2f%2fservizi.inps.it%2fservizi%2fInvCiv2010%2fPages%2fFrmNews.aspx%3fS%3dS&amp;S=S" target="_blank">Domande</a></td>
								</tr>
							</tbody>
						</table>
						</td>
					</tr>
					<tr>
						<td><a href="http://le-medleg-00.aol.it:8085/asterLogin/login" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/invalidita_civilw.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 30px;" /></a></td>
						<td><a href="http://le-medleg-00.aol.it:8085/asterLogin/login" target="_blank"><b>INVALIDITA' CIVILE</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Moduli Medicina Legale</font></a></td>
					</tr>
					<tr onclick="HideS('dettaglioSANITA')">
						<td style="width: 36px;"><img src="<%=renderRequest.getContextPath().toString()%>/Images/screening.PNG" style="border-width: 0px; border-style: solid; width: 35px; height: 36px;" /></td>
						<td><b>SANITA' PUBBLICA E SCREENING</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Laboratorio Sanità Pubblica e Screening</font></td>
					</tr>
					<tr id="dettaglioSANITA" style="display:none">
						<td>&nbsp;</td>
						<td>
						<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
							<tbody>
								<tr>
									<td><a href="http://datacenter.infoset-dce.it/infolab/login.asp" target="_blank">LSP</a></td>
								</tr>
								<tr>
									<td><a href="http://datacenter.infoset-dce.it/progettodonna/login.asp" target="_blank">Screening - Progetto Donna</a></td>
								</tr>
							</tbody>
						</table>
						</td>
					</tr>
					<tr>
						<td><a href="http://pianiterapeutici.aslmi1.mi.it/" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/piani_terapeutici.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 31px;" /></a></td>
						<td><a href="http://pianiterapeutici.aslmi1.mi.it/" target="_blank"><b>PIANI TERAPEUTICI</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Piani Terapeutici - contratto manutenzione</font></a></td>
					</tr>
					<tr onclick="HideS('dettaglioPROTESI')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/protesica.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 34px;" /></td>
						<td><b>PROTESICA</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Protesia maggiore e minore</font></td>
					</tr>
					<tr id="dettaglioPROTESI" style="display:none">
						<td>&nbsp;</td>
						<td>
						<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
							<tbody>
								<tr>
									<td><a href="https://dcss.cgi.crs.lombardia.it/assistantrl/home/" target="_blank">Assistant RL</a></td>
								</tr>
								<tr>
									<td><a href="https://fornitoriprotesi.servizirl.it/assistantrl/" target="_blank">Protesica Maggiore - Gestione pratiche</a></td>
								</tr>
								<tr>
									<td><a href="http://le-protes-00.aol.it:8084/coswin/" target="_blank">Protesica Maggiore - Erogazione ausili</a></td>
								</tr>
								<tr>
									<td><a href="https://dcss.cgi.crs.lombardia.it/celiachiarl/" target="_blank">Protesica Minore - Celiachia</a></td>
								</tr>
								<tr>
									<td><a href="https://artcare.serenity.it/" target="_blank">Protesica Minore - Pannoloni</a></td>
								</tr>
								<tr>
									<td><a href="https://lombardia.webcare.it/milano1/default.aspx" target="_blank">Protesica Minore - Diabete e pross. incontinenza</a></td>
								</tr>
							</tbody>
						</table>
						</td>
					</tr>
					<tr onclick="HideS('dettaglioVACCINAZIONI')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/vaccinazioni.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 30px;" /></td>
						<td><b>VACCINAZIONI</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Gestione vaccinazioni</font></td>
					</tr>
					<tr id="dettaglioVACCINAZIONI" style="display:none">
						<td>&nbsp;</td>
						<td>
						<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
							<tbody>
								<tr>
									<td><a href="http://le-vaccin-00.aol.it" target="_blank">SiaPov - gestione prenotazioni</a></td>
								</tr>
								<tr>
									<td><a href="http://siapov.aol.it/casia/" target="_blank">Casia - antinfluenzali e antipneumococciche</a></td>
								</tr>
								<tr>
									<td><a href="http://le-casiap-00.aol.it/casiaBO/" target="_blank">Casia - pannello amministrativo</a></td>
								</tr>
							</tbody>
						</table>
						</td>
					</tr>
				</tbody>
			</table>
			</td>
		</tr>
	</tbody>
</table>
</div>