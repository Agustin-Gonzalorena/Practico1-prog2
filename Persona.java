public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int[] fechaNacimiento;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public int[] getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int dia, int mes, int anio) {
        this.fechaNacimiento = new int[] { dia, mes, anio };
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

    // metodos

    public int calcularEdad() {
        int[] fechaActual = new int[] { 16, 8, 2023 };
        int anio = getFechaNacimiento()[2];
        int mes = getFechaNacimiento()[1];
        int dia = getFechaNacimiento()[0];
        int edad = fechaActual[2] - anio;
        if (fechaActual[1] < mes) {
            edad--;
        } else if (fechaActual[1] == mes && fechaActual[0] < dia) {
            edad--;
        }
        return edad;
    }
}