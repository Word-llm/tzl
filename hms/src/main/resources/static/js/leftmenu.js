    document.onselectstart = function() { return false; }
	// Menu Lateral
    if (document.getElementById){
    document.write('<style type="text/css">\n')
    document.write('.options{display: none;}\n')
    document.write('</style>\n')
    }
    function SwitchMenu(obj){
    	if(document.getElementById){
    	var el = document.getElementById(obj);
    		if(el.style.display != "block"){
    			el.style.display = "block";
    		}else{
    			el.style.display = "none";
    		}
    	}
    }
