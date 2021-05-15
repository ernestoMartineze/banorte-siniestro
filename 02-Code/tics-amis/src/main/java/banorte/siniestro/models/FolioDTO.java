package banorte.siniestro.models;


import java.util.UUID;

public class FolioDTO {

  public int id;
  public String clave;
  public UUID uuid;

  public FolioDTO() {
  }
  public FolioDTO(int id, String clave) {
    super();
    this.id = id;
    this.clave = clave;
    this.uuid = UUID.randomUUID();
  }
}
