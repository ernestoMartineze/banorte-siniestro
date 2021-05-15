package banorte.siniestro.controllers;


import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


import banorte.siniestro.models.FolioDTO;
import banorte.siniestro.models.PeticionFolioDTO;

@Path("/apiResources/foliador")
public class FoliadorRest {

    private final Set<FolioDTO> folio = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FoliadorRest(){
        folio.add( new FolioDTO(1,"CVE-SINIESTRO") );
    }

    @GET
    
    public Set<FolioDTO> generarFolio(PeticionFolioDTO peticion) {
        folio.add( new FolioDTO(1,peticion.getClaveSiniestro()) );
        return folio;
    }

}

