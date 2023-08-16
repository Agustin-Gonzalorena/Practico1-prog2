public class Persona {
    public static int[] FECHA_ACTUAL = new int[] { 16, 8, 2023 };//Consultar.

    private String nombre;
    private String apellido;
    private int edad;
    private int[] fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public void setFechaNacimiento(int dia, int mes, int anio) {
        this.fechaNacimiento = new int[] { dia, mes, anio };
    }
     public int[] getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getAll() {
        String datos= "Dni: "+this.dni+" Nombre: "+this.nombre+" Apellido: "+this.apellido+" Fecha de nacimiento: "+this.fechaNacimiento[0]+"/"+this.fechaNacimiento[1]+"/"+this.fechaNacimiento[2]+" Sexo: "+this.sexo+" Peso: "+this.peso+" Altura: "+this.altura;
        return datos;
    }
    // constructores

    public Persona(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.fechaNacimiento = new int[] { 1, 1, 2000 };
        this.sexo = "F";
        this.peso = 1;
        this.altura = 1;
        this.edad = calcularEdad();
    }
    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(int dni, String nombre, String apellido,int[] fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Persona(int dni, String nombre, String apellido,int[] fechaNacimiento, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }
    public Persona(int dni, String nombre, String apellido,int[] fechaNacimiento, String sexo,double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
    }
    public Persona(int dni, String nombre, String apellido,int[] fechaNacimiento, String sexo,double peso,double altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // metodos

    public int calcularEdad() {
        int anio = getFechaNacimiento()[2];
        int mes = getFechaNacimiento()[1];
        int dia = getFechaNacimiento()[0];
        int edad = FECHA_ACTUAL[2] - anio;
        if (FECHA_ACTUAL[1] < mes) {
            edad--;
        } else if (FECHA_ACTUAL[1] == mes && FECHA_ACTUAL[0] < dia) {
            edad--;
        }
        return edad;
    }
}

