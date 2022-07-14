import java.io.*;
import java.util.List;
public class SerializarEstudantes<E> {

    private String nomeArquivo ;

    FileOutputStream arquivo = null ;
    ObjectOutputStream objeto = null ;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try {
            arquivo = new FileOutputStream(nomeArquivo);
            objeto = new ObjectOutputStream(arquivo);
            objeto.writeObject(estudantes);
        }
        catch (Exception e){
            throw new IllegalArgumentException("Nao foi possivel serializar");
        }
        finally {
            if (objeto != null){
                try {
                    objeto.close();
                } catch (IOException e) {
                    throw new RuntimeException("Nao foi possivel serializa");
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> estudantes = null ;
        FileInputStream arquivo = null ;
        ObjectInputStream objeto = null ;
        try {
            arquivo = new FileInputStream(nomeArquivo);
            objeto = new ObjectInputStream(arquivo);
            estudantes = (List<Estudante>)objeto.readObject();


        } catch (Exception e){
            System.out.println("Nao foi possivel desserializar");
        }
        finally {
            if (objeto != null){
                try {
                    objeto.close();
                } catch (IOException e) {
                    throw new RuntimeException("Nao foi possivel desserializar");
                }
            }
        }

        return estudantes;
    }

} 
