<%@ include file="/init.jsp" %>
<script type="text/javascript">
<%
String str="No Agent";
%>
function HideC(idDett){
	var obj=document.getElementById(idDett);
	obj.style.display=(obj.style.display!='none')?'none':'';
}

function CheckSiss(){
	if("<%=str%>"=="No Agent"){
		window.open("http://le-sisswr-01.aol.it:48080/sissware/apps/sissware-start.jnlp");
	}
}

function Apri(Pagina){
	window.open(Pagina);
}

</script>
<div style="height:300px; overflow:auto;">
<table>
	<tbody>
		<tr>
			<td>
			<table border="0" cellpadding="3" cellspacing="0">
				<tbody>
					<tr onclick="CheckSiss();Apri('http://le-psnet-p1.aol.it')">
						<td style="width: 36px;"><img src="<%=renderRequest.getContextPath().toString()%>/Images/psnet.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 35px;" /></td>
						<td><b>PS-NET</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Pronto Soccorso</font></td>
					</tr>
					<tr onclick="CheckSiss();Apri('http://10.79.5.220:8081/fenix/')">
						<td><img alt="" src="<%=renderRequest.getContextPath().toString()%>/Images/fenix.PNG" style="width: 36px; height: 34px;" /></td>
						<td><b>FENIX</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">RIS Application</font></td>
					</tr>
					<tr onclick="HideC('dettaglioPACS')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/pacs.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></td>
						<td><b>Carestream PACS</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">PACS Application</font></td>
					</tr>
					<tr id="dettaglioPACS" style="display:none">
						<td>&nbsp;</td>
						<td>
						<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
							<tbody>
								<tr>
									<td><a href="http://192.168.173.47/masterview/mv.jsp" target="_blank">Abbiategrasso</a></td>
								</tr>
								<tr>
									<td><a href="http://192.168.161.40/masterview/mv.jsp" target="_blank">Cuggiono</a></td>
								</tr>
								<tr>
									<td><a href="http://10.79.5.205/masterview/mv.jsp" target="_blank">Legnano</a></td>
								</tr>
								<tr>
									<td><a href="http://10.85.1.15/masterview/mv.jsp" target="_blank">Magenta</a></td>
								</tr>
							</tbody>
						</table>
						</td>
					</tr>
					<tr onclick="CheckSiss();Apri('http://le-acceweb-p2.aol.it')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/acceweb.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></td>
						<td><b>ACCEWEB</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Accettazione - Trasferimento - Dimissione</font></td>
					</tr>
					<tr onclick="CheckSiss();Apri('http://le-cupnet-p3.aol.it')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/cupnet.PNG" style="border-width: 0px; border-style: solid; width: 27px; height: 36px;" /></td>
						<td><b>CUP-NET</b><br />
						<font color="#808080"><span style="font-style: italic; font-size: 10px">Gestione Clienti e Prenotazioni</span></font></td>
					</tr>
					<tr onclick="Apri('http://le-ambnet-p1.aol.it')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/ricettario.PNG" style="border-width: 0px; border-style: solid; height: 36px; width: 29px;" /></td>
						<td><b>Nuovo RICETTARIO</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Gestione Ambulatori</font></td>
					</tr>
				</tbody>
			</table>
			</td>
			<td>
			<table border="0" cellpadding="3" cellspacing="0">
				<tbody>
					<tr onclick="Apri('http://le-devsan-01.aol.it/REPOPL/')">
						<td style="width: 36px;"><img src="<%=renderRequest.getContextPath().toString()%>/Images/postiletto.PNG" style="border-width: 0px; border-style: solid; width: 35px; height: 36px;" /></td>
						<td><b>POSTI LETTO</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Posti letto</font></td>
					</tr>
					<tr onclick="Apri('http://le-accenet-p1.aol.it')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/farmaci.PNG" style="border-width: 0px; border-style: solid; width: 32px; height: 36px;" /></td>
						<td><b>FILE F</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Prescrizione Farmaci File F</font></td>
					</tr>
					<tr onclick="CheckSiss();Apri('http://le-galileo-03.aol.it:9080/webmed/Applet/galileo.jnlp')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/galileo.PNG" style="border-width: 0px; border-style: solid; width: 27px; height: 36px;" /></td>
						<td><b>GALILEO</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Galileo</font></td>
					</tr>
					<tr onclick="CheckSiss();Apri('http://le-bloope-00.aol.it:8090/ormaweb')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/ormaweb.PNG" style="border-width: 0px; border-style: solid; width: 24px; height: 36px;" /></td>
						<td><b>ORMAWeb</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Registro Operatorio e Gestione Sale Operatorie</font></td>
					</tr>
					<tr onclick="Apri('http://le-drgsrv-01.aol.it')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/codefinder.PNG" style="border-width: 0px; border-style: solid; width: 40px; height: 36px;" /></td>
						<td><b>CodeFinder</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Simulazione DRG</font></td>
					</tr>
					<tr onclick="HideC('dettaglioRegione')">
						<td><img src="<%=renderRequest.getContextPath().toString()%>/Images/link_esterni.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></td>
						<td><b>Link esterni</b><br />
						<font color="#808080" style="font-size: 10px; font-style: italic">Link a siti esterni e portali Regione Lombardia</font></td>
					</tr>
					<tr id="dettaglioRegione" style="display:none">
						<td>&nbsp;</td>
						<td>
						<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
							<tbody>
								<tr onclick="Apri('https://dcss.cgi.crs.lombardia.it/menusiss/')">
									<td>Menù SISS</td>
								</tr>
								<tr onclick="Apri('https://dcss.cgi.crs.lombardia.it/assistantrl/')">
									<td>Protesi e ausili (AssistantRL)</td>
								</tr>
								<tr onclick="Apri('https://dcss.cgi.crs.lombardia.it/RMR')">
									<td style="height: 22px">Rete Malattie Rare (RMR)</td>
								</tr>
								<tr onclick="CheckSiss();Apri('https://dit.servizirl.it')">
									<td style="height: 22px">Piattaforma SMAF</td>
								</tr>
								<tr onclick="Apri('https://rc.emergenzaurgenza.net/eu_rc/login.jsp')">
									<td style="height: 22px">EUOL-RC</td>
								</tr>
								<tr onclick="Apri('http://www.nextiti.it/progettodonna/login.asp')">
									<td style="height: 22px">Progetto Donna</td>
								</tr>
								<tr onclick="Apri('http://biogestr5.hq.hospital-consulting.it')">
									<td style="height: 22px">Hospital Consulting</td>
								</tr>
								<tr onclick="Apri('https://www.servicemedonweb.it/')">
									<td style="height: 22px">Richiesta superfici - SERVICE MED</td>
								</tr>
								<tr onclick="Apri('https://www.medihartonweb.it/')">
									<td style="height: 22px">Richiesta superfici - MEDI-H-ART</td>
								</tr>
								<tr onclick="Apri('https://arjohuntleigh-express.com')">
									<td style="height: 22px">Richiesta superfici - ARJOHUNTLEIGH</td>
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
