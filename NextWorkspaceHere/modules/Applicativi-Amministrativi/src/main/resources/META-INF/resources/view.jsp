<%@ include file="/init.jsp" %>
<script type="text/javascript">

function HideA(idDett){
	var obj=document.getElementById(idDett);
	obj.style.display=(obj.style.display!='none')?'none':'';
}
</script>
<div style="height:300px; overflow:auto;">
<table border="0" cellpadding="3" cellspacing="0">
	<tbody>
		<tr onclick="HideA('dettaglioOracle')">
			<td style="width: 36px;"><img src="<%=renderRequest.getContextPath().toString()%>/Images/oracle.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 36px;" /></td>
			<td><b>ORACLE App.</b><br />
			<font color="#808080" style="font-size: 10px; font-style: italic">Ordini - Magazzini - Fatturaz. - Contabilità</font></td>
		</tr>
		<tr id="dettaglioOracle" style="display:none">
			<td>&nbsp;</td>
			<td>
			<table cellpadding="3" style="width: 100%;font-family: Tahoma; font-size: 12px; color: #000080">
				<tbody>
					<tr>
						<td><a href="http://le-orapps-01.aol.it:8041/OA_HTML/AppsLocalLogin.jsp?langCode=I" target="_blank">ORACLE APPLICATIONS</a></td>
					</tr>
					<tr>
						<td><a href="http://sio99-1:8080/OA_HTML/I/oaprod-it" target="_blank">OAPSS LIRE</a></td>
					</tr>
				</tbody>
			</table>
			</td>
		</tr>
		<tr>
			<td><a href="http://le-porpiu-01.aol.it:8081/AOLRR/home.summer" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/porta.PNG" style="border-width: 0px; border-style: solid; width: 37px; height: 36px;" /></a></td>
			<td><a href="http://le-porpiu-01.aol.it:8081/AOLRR/home.summer" target="_blank"><b>PORTA +</b><br />
			<font color="#808080" style="font-size: 10px; font-style: italic">Richieste Web ai Magazzini</font></a></td>
		</tr>
		<tr>
			<td><a href="http://le-folium-01.aol.it:8080/Folium/index.do" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/folium.PNG" style="border-width: 0px; border-style: solid; width: 36px; height: 34px;" /></a></td>
			<td><a href="http://le-folium-01.aol.it:8080/Folium/index.do" target="_blank"><b>FOLIUM</b><br />
			<font color="#808080" style="font-size: 10px; font-style: italic">Protocollo Generale</font></a></td>
		</tr>
		<tr>
			<td><a href="http://le-civilia-01.aol.it:18080/portal/" target="_blank"><img src="<%=renderRequest.getContextPath().toString()%>/Images/civilia.PNG" style="border-width: 0px; border-style: solid; width: 30px; height: 36px;" /></a></td>
			<td><a href="http://le-civilia-01.aol.it:18080/portal/" target="_blank"><b>CIVILIA WEB</b><br />
			<font color="#808080" style="font-size: 10px; font-style: italic">Atti Amministrativi - Delibere</font></a></td>
		</tr>
		<tr>
			<td><a href="http://ma-prdeus-01.aol.it:8080/Portale" target="_blank"><img alt="" src="<%=renderRequest.getContextPath().toString()%>/Images/eusis.PNG" style="height: 35px; width: 36px;" /></a></td>
			<td><a href="http://ma-prdeus-01.aol.it:8080/Portale" target="_blank"><b>EUSIS</b></a></td>
		</tr>
	</tbody>
</table>
</div>
