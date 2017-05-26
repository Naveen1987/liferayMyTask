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
            	label:'<a href="/group/farmacia/welcome"  target="_blank">Farmacia</a>'	
            },
        	{
            	label:'<a href="/group/siecio_cio/welcome" target="_blank">SIECIO/CIO</a>'	
            },
            {
            	label:'<a href="/group/spp_mc/welcome" target="_blank">SPP/MC</a>'	
            },
            {
            	label:'<a href="/group/direzioni_mediche/welcome" target="_blank">Direzioni Mediche</a>'	
            },
            {
            	label:'<a href="/group/sitra/welcome" target="_blank">SITRA</a>'	
            },
            {
            	label:'<a href="/group/hrm/welcome" target="_blank">HRM</a>'	
            },
            {
            	label:'<a href="/group/comitati_gruppi_di_miglioramento/welcome" target="_blank">Comitati/Gruppi di Miglioramento</a>'	
            },
            {
            	label:'<a href="/group/rapporti_e_dati/welcome" target="_blank">Rapporti e Dati</a>'	
            },
            {
            	label:'<a href="/group/accrediatmento_e_controlli/welcome" target="_blank">Accrediatmento e Controlli</a>'	
            },
            {
            	label:'<a href="/group/cartella_clinica/welcome" target="_blank">Cartella Clinica</a>'	
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