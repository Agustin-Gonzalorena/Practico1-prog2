public class Main {
    public static void main(String[] args) {
        Persona agus = new Persona(12345678);
        System.out.println(agus.calcularEdad());

        agus.setFechaNacimiento(12, 12, 1998);
        System.out.println(agus.calcularEdad());
        System.out.println(agus.getAll());
   }
}
