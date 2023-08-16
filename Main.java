public class Main {
    public static void main(String[] args) {
        Persona agus = new Persona(12345678);
        System.out.println(agus.calcularEdad());

        agus.setFechaNacimiento(12, 2, 1998);
        System.out.println(agus.calcularEdad());
    }
}
