class Main {
  public static void main(String[] args) {
    Persona persona = new Persona();
    
    persona.setNombre("Max Power");
    persona.setEdad(40);
    persona.setTelefono("123456789");

    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Edad: " + persona.getEdad());
    System.out.println("Teléfono: " + persona.getTelefono());
  }
}

class Persona {
  private int edad;
  private String nombre;
  private String telefono;

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getTelefono() {
    return this.telefono;
  }
}