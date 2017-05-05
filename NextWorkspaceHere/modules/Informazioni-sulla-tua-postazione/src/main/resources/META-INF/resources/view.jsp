<%@ include file="/init.jsp" %>
<div style="height:100px; overflow:auto;">
<table cellpadding="6" cellspacing="1" style="width: 100%">
	<tbody>
		<tr>
			<td id="agent">&nbsp;</td>
		</tr>
		<tr>
			<td id="siss">&nbsp;</td>
		</tr>
		<tr>
			<td id="userName">&nbsp;</td>
		</tr>
	</tbody>
</table>
</div>
<script type="text/javascript">
(function() {
	if (typeof(AUI) !== 'undefined') {
	AUI().ready('aui-base','aui-io-request','aui-io-plugin', function(A) {
		makeAgentRequest(A);
		makeSISSRequest(A);
	});
	}
})();

function SetHTML(A, idDett, text, styleString){
	var obj = A.one("#" + idDett +"")
	if (obj != null){
		obj.set("innerHTML", text);
		obj.setAttribute("style", styleString);
	}
}

function readBody(xhr) {
    var data;
    if (!xhr.responseType || xhr.responseType === "text") {
        data = xhr.responseText;
    } else if (xhr.responseType === "document") {
        data = xhr.responseXML;
    } else {
        data = xhr.response;
    }
    return data;
}

// Create the XHR object.
function createCORSRequest(method, url) {
  var xhr = new XMLHttpRequest();
  if ("withCredentials" in xhr) {
    // XHR for Chrome/Firefox/Opera/Safari.
    xhr.open(method, url, true);
  } else if (typeof XDomainRequest != "undefined") {
    // XDomainRequest for IE.
    xhr = new XDomainRequest();
    xhr.open(method, url);
  } else {
    // CORS not supported.
    xhr = null;
  }
  return xhr;
}

function SetAgentHTML(A, response){
	var idDett = "agent";
	if (response.indexOf("&lt;MESSAGGIO servizio=&quot;SISSWARE&quot;&gt;")>-1) {
		SetHTML(A, idDett, "SISSWARE", "background-color: #33CC33;	 font-family: Calibri; font-size: 10pt; color: white;");
	} else if (response.indexOf("&lt;MESSAGGIO servizio=&quot;EPR-AGENT&quot;&gt;")>-1) {
		SetHTML(A, idDett, "EPR-AGENT", "background-color: #33CC33;	 font-family: Calibri; font-size: 10pt; color: white;");
	} else {
		SetHTML(A, idDett, "No Agent", "background-color: #FF3300; font-family: Calibri; font-size: 10pt;");
	}
}

function SetSISSHtml(A, response){
	var isDett = "siss";
	if (response.indexOf("&lt;COGNOME&gt;")>-1) {
		SetHTML(A, idDett, "SISS", "background-color: #33CC33;	 font-family: Calibri; font-size: 10pt; color: white;");
	} else {
		SetHTML(A, idDett, "no SISS", "background-color: #FF3300; font-family: Calibri; font-size: 10pt;");
	}
}

function SetUserNameHTML(A, response){
	var isDett = "userName";
	if (response.indexOf("&lt;COGNOME&gt;")>-1) {
		var inizioC = response.indexOf("&lt;COGNOME&gt;") + 15;
		var fineC = response.indexOf("&lt;/COGNOME&gt;");
		var cognome = response.substring(inizioC, fineC);
		var inizioN = response.indexOf("&lt;NOME&gt;") + 15;
		var fineN = response.indexOf("&lt;/NOME&gt;");
		var nome = response.substring(inizioN, fineN);
		SetHTML(A, idDett, cognome + " " + nome, "background-color: #33CC33;	 font-family: Calibri; font-size: 10pt; color: white;");
	}
}

function AgentError(A) {
	SetHTML(A, "agent", "No Agent", "background-color: #FF3300; font-family: Calibri; font-size: 10pt;");
}
function SISSError(A) {
	SetHTML(A, "siss", "no SISS", "background-color: #FF3300; font-family: Calibri; font-size: 10pt;");
}

// Make the actual CORS request.
function makeAgentRequest(A) {
	// All HTML5 Rocks properties support CORS.
	var url = "//localhost.:1060/" + "<?xml version='1.0' encoding='ISO-8859-1'?><RICHIESTA_LEGGIDATA><RICHIEDENTE><SISTEMA>TEST</SISTEMA><OPERATORE><CODICEOPERATORE tipoOperatore='DIPARTIMENTALE'>UTENTE-1</CODICEOPERATORE></OPERATORE></RICHIEDENTE></RICHIESTA_LEGGIDATA>";

	var xhr = createCORSRequest('GET', url);
	if (!xhr) {
		AgentError(A)
		return;
	}
	// Response handlers.
	xhr.onload = function () {
		var responseText = xhr.responseText;
		SetAgentHTML(A, responseText);
	};
	xhr.onerror = AgentError(A);
	xhr.send();
}

function makeSISSRequest(A) {
	// All HTML5 Rocks properties support CORS.
	var url = "//localhost.:1060/" + "<?xml version='1.0' encoding='ISO-8859-1'?><RICHIESTA_LEGGIOPERATORE><RICHIEDENTE><SISTEMA>TEST</SISTEMA><OPERATORE><CODICEOPERATORE tipoOperatore='DIPARTIMENTALE'>TEST</CODICEOPERATORE></OPERATORE></RICHIEDENTE></RICHIESTA_LEGGIOPERATORE>";

	var xhr = createCORSRequest('GET', url);
	if (!xhr) {
		SISSError(A)
		return;
	}
	// Response handlers.
	xhr.onload = function () {
		var responseText = xhr.responseText;
		SetSISSHtml(A, responseText);
		SetUserNameHTML(A, responseText);
	};
	xhr.onerror = SISSError(A);
	xhr.send();
}

</script>