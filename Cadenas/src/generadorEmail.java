import java.util.Locale;

public class generadorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        // nombre, empresa, dominio
        String nombre_usuario = "Adair Emmanuel Medina Velazquez";
        var nombre_empresa = "INTERMET";
        String extDominio = ".com.mx";
        var priNombre = nombre_usuario.substring(0,5);
        var segNombre = nombre_usuario.substring(6,14);
        var primApellido = nombre_usuario.substring(15,21);
        var segApellido = nombre_usuario.substring(22,31);
        var identificacion = "@" + nombre_empresa + extDominio;


        var concatenacion = String.join(".",priNombre,segNombre,primApellido,segApellido);
        var nombreNormalizado = concatenacion.toLowerCase();
        var dominioNormalizado = identificacion.toLowerCase();
        var correo = (concatenacion + identificacion).toLowerCase();

        System.out.println("Nombre Usuario: " + nombre_usuario);
        System.out.println("Nombre Usuario Normalizado: " + nombreNormalizado);
        System.out.println("\n");
        System.out.println("Nombreempresa: " + nombre_empresa);
        System.out.println("Extensión del dominio: " + extDominio);
        System.out.println("Dominio de email normalizado: " + dominioNormalizado);
        System.out.println("\n");
        System.out.println("Email final generado: " + correo);

    }
}
