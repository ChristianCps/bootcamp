public class Curso extends Conteudo {
    private int duracaoHoras;

    @Override
    public double calcularExperiencia() {
        return XP_DEFAULT * duracaoHoras;
    }

    public Curso() {}

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTituloConteudo() + '\'' +
                ", descricao='" + getDescricaoConteudo() + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                '}';
    }
}

