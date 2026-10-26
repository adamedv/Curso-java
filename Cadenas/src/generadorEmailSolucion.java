public class generadorEmailSolucion {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");

        var nombreUsuario = " Adair Emmanuel Medina Velazquez";
        var nombreEmpresa = "INTERMET";
        var extencionDominio = ".com.mx";

        var nombreNormalizado = nombreUsuario.trim().replace(" ",".").toLowerCase();
        System.out.println("Nombre normalizado: " + nombreNormalizado + "\n");

        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Extensión del dominio: " + extencionDominio);
        var dominioNormalizado = String.join("","@",nombreEmpresa.toLowerCase(),extencionDominio);
        System.out.println("Dominio normalizado: " + dominioNormalizado + "\n");

        System.out.println("Email final generado: " + nombreNormalizado + dominioNormalizado);



    }
}
