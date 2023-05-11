import java.io.*;

public class Problema {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("/home/usuario/IdeaProjects/prueba/mensaje.txt"));
            bw = new BufferedWriter(new FileWriter("/home/usuario/IdeaProjects/prueba/mensaje_cifrado.txt"));

            String linea = null;

            /* Lectura y validación  de clave */

            while ((linea = br.readLine()) != null) {
                StringBuilder sb = new StringBuilder(linea.length());
                for(int i = 0; i < linea.length(); i++){
                    linea.trim();

                }

                /* Aquí vendría la lógica del programa */



                bw.write(sb.toString()); /* Escribe la cadena de caracteres en el fichero*/
                bw.newLine(); /* escribe nueva línea en el fichero */

            }
            System.out.println("El mensaje ha sido cifrado correctamente");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bw != null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}


