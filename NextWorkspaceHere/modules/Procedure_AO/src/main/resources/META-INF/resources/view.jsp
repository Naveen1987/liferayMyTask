<%@ include file="/init.jsp" %>
<div id="ProcedureAO"></div>

<script>
YUI().use(
  'aui-tree-view',
  function(Y) {
    // Create an array object for the tree root and child nodes
    var children = [
      {
        children: [
        	{
        		label:'<a href="/group/ufficio_qualita_e_accreditamento/welcome" target="_blank">Ufficio Qualità e Accreditamento</a>'	
        	},
        	{
            	label:'<a href="/group/farmacia/welcome">Farmacia</a>'	
            },
        	{
            	label:'<a href="/group/siecio_cio/welcome">SIECIO/CIO</a>'	
            },
            {
            	label:'<a href="/group/spp_mc/welcome">SPP/MC</a>'	
            },
            {
            	label:'<a href="/group/direzioni_mediche/welcome">Direzioni Mediche</a>'	
            },
            {
            	label:'<a href="/group/sitra/welcome">SITRA</a>'	
            },
            {
            	label:'<a href="/group/hrm/welcome">HRM</a>'	
            },
            {
            	label:'<a href="/group/comitati_gruppi_di_miglioramento/welcome">Comitati/Gruppi di Miglioramento</a>'	
            },
            {
            	label:'<a href="/group/rapporti_e_dati/welcome">Rapporti e Dati</a>'	
            },
            {
            	label:'<a href="/group/accrediatmento_e_controlli/welcome">Accrediatmento e Controlli</a>'	
            },
            {
            	label:'<a href="/group/cartella_clinica/welcome">Cartella Clinica</a>'	
            }
            
        ],
        expanded: true,
        label: '<b>&nbsp;Procedure AO</b>'
      }
    ];
    // Create a TreeView Component
    new Y.TreeView(
      {
        boundingBox: '#ProcedureAO',
        children: children
      }
    ).render();
  }
);
</script>