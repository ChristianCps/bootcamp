import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    @Override
    public double calcularExperiencia() {
        return XP_DEFAULT + 20d;
    }

    public Mentoria() {}

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTituloConteudo() + '\'' +
                ", descricao='" + getDescricaoConteudo() + '\'' +
                ", data=" + dataMentoria +
                '}';
    }
}
