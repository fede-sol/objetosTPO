 package utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Fede
 */
public class FileHandler {
    
    private FileInputStream fileInput;
    private FileOutputStream fileOutput;
   
  

    private ObjectInputStream objectInput;
    private ObjectOutputStream objectOutput;
    
    
    public Object importarObjeto(String ruta) throws ClassNotFoundException {
        Object object = null;
        try {
            objectInput = new ObjectInputStream(new FileInputStream(ruta));
            object = objectInput.readObject();
            objectInput.close();
        } catch (IOException e) {
            System.out.println("Error al importar " + ruta + "Error: " + e);

        }
        return object;
    }
    
        public Object importarObjeto(File ruta) throws ClassNotFoundException {
        Object object = null;
        try {
            
           
            objectInput = new ObjectInputStream(new FileInputStream(ruta));
            object = objectInput.readObject();
            
            objectInput.close();
             
        } catch (IOException e) {
            System.out.println("Error al importar " + ruta.getAbsolutePath() +"Error: " + e);
            

        }
        return object;
    }
        
        public void exportarObjeto(Object objeto, File ruta) {
            try {
                objectOutput = new ObjectOutputStream(new FileOutputStream(ruta));
                objectOutput.writeObject(objeto);
                objectOutput.close();
            } catch (IOException e) {
                System.out.println("Error al exportar " + objeto + " " + ruta.getAbsolutePath() + " Error: " +  e);
            }

        }
        
        
        public int importarEntero(File ruta) {

        int numero = 0;
        try {
            fileInput = new FileInputStream(ruta);

            numero = fileInput.read();

            fileInput.close();
        } catch (IOException e) {
            System.out.println("Error al importar" + ruta.getAbsolutePath());
        }

        return numero;
    }

    public void exportarEntero(File ruta, int valor) {

        try {

            fileOutput = new FileOutputStream(ruta);
            fileOutput.write(valor);
            fileOutput.close();

        } catch (IOException e) {
            System.out.println("Error al exportar" + ruta.getAbsolutePath());
        }
    }
}
