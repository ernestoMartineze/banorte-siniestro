package banorte.siniestro.models;

public class PeticionFolioDTO{
    private String depto;
    private String asesor;
    private String claveSiniestro;
    
    public PeticionFolioDTO(){}

    public String getDepto(){
        return this.depto;
    };
    public String getClaveSiniestro(){
        return this.claveSiniestro;
    };
    public String getAsesor(){
        return this.asesor;
    };
    public void setDepto(String depto){
        this.depto = depto;
    };
    public void setClaveSiniestro(String clave){
        this.claveSiniestro = clave;
    };
    public void setAsesor(String asesor){
        this.asesor = asesor;
    };

    public PeticionFolioDTO(String depto, String asesor, String claveSiniestro){
        this.depto = depto;
        this.asesor = asesor;
        this.claveSiniestro = claveSiniestro;
    }

}