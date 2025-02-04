class Auteur {
  // Attributs
  private String nom;

  private String citation_tragédie;
  private int qualité_tragédie;

  private String citation_comédie;
  private int qualité_comédie;

  private String citation_drame;
  private int qualité_drame;

  

  public Auteur(String nom, String citation_tragédie, int qualité_tragédie, String citation_comédie,
      int qualité_comédie, String citation_drame, int qualité_drame) {
    this.nom = nom;
    this.citation_tragédie = citation_tragédie;
    this.qualité_tragédie = qualité_tragédie;
    this.citation_comédie = citation_comédie;
    this.qualité_comédie = qualité_comédie;
    this.citation_drame = citation_drame;
    this.qualité_drame = qualité_drame;
  }

  

  public String getNom() {
    return nom;
  }



  public String getCitation_tragédie() {
    return citation_tragédie;
  }



  public int getQualité_tragédie() {
    return qualité_tragédie;
  }



  public String getCitation_comédie() {
    return citation_comédie;
  }



  public int getQualité_comédie() {
    return qualité_comédie;
  }



  public String getCitation_drame() {
    return citation_drame;
  }



  public int getQualité_drame() {
    return qualité_drame;
  }



  /***
   * Affiche le style dans lequel l'auteur est le plus fort
   * @return Style 
   */
  public Style pointFort() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pointFort'");
  }

  /**
   * Renvoie la qualité de l'auteur dans le style demandé
   * @param s
   * @return (int) la qualité
   */
  public int qualitéStyle(Style s){
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'qualitéStyle'");
  }

  /**
   * Renvoie la citation de l'auteur dans le style demandé
   * @param s
   * @return (String) la citation
   */
  public String citationStyle(Style s) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'citationStyle'");
}

  @Override
  public String toString(){
      return "TODO";
  }
}
