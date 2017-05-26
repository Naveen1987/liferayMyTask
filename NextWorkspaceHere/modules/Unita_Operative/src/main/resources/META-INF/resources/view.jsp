<%@ include file="/init.jsp" %>
<div id="UnitaOperative"></div>
<script>
YUI().use(
  'aui-tree-view',
  function(Y) {
    // Create an array object for the tree root and child nodes
    var children = [
      {
        children: [
        	{
        		label:' <a  href="/group/farmacia_ospedalieraIs/welcome"  target="_blank">Farmacia OspedalieraIs</a>'	
        	},
        	{
            	label:'<a  href="/group/staff_sistemi_snformativi/welcome"  target="_blank">Staff Sistemi Informativi</a>'	
            },
        	{
            	label:'<a  href="/group/sviluppo_e_formazione/welcome"  target="_blank">Sviluppo e Formazione</a>'	
            },
            {
            	label:'<a  href="/group/controllo_di_gestione/welcome"  target="_blank">Controllo di Gestione</a>'	
            },
            {
            	label:' <a  href="/group/ufficio_relazioni_con_il_pubblico/welcome" target="_blank">Ufficio Relazioni con il pubblico</a>'	
            },
            {
            	label:'<a  href="/group/servizio_risorse_umane/welcome" target="_blank">Servizio Risorse Umane</a>'	
            },
            {
            	label:' <a  href="/group/ufficio_valutazione/welcome" target="_blank">Ufficio Valutazione</a>'	
            },
            {
            	label:'<a  href="/group/flussi_informativi_sanitari/welcome" target="_blank">Flussi Informativi Sanitari</a>'	
            },
            {
            	label:'<a  href="/group/laboratorio_analisi_magenta/welcome" target="_blank">Laboratorio Analisi Magenta</a>'	
            },
            {
            	label:'<a  href="/group/servizio_acquisti_e_appalti/welcome" target="_blank">Servizio Acquisti e Appalti</a>'	
            },
            {
            	label:'<a  href="/group/servizio_dietietico/welcome" target="_blank">Servizio Dietietico</a>'	
            },
            {
            	label:'<a  href="/group/affari_generali_e_legali/welcome" target="_blank">Affari Generali e Legali</a>'	
            },
            {
            	label:'<a  href="/group/comitato_scientifico/welcome" target="_blank">Comitato Scientifico</a>'	
            }
        ],
        expanded: true,
        label: '<b>&nbsp;Unità Operative</b>'
      }
    ];

    // Create a TreeView Component
    new Y.TreeView(
      {
        boundingBox: '#UnitaOperative',
        children: children
      }
    ).render();
  }
);
</script>