public abstract class Conteudo {
    protected static final double XP_DEFAULT = 10d;

    private String tituloConteudo;
    private String descricaoConteudo;

    public abstract double calcularExperiencia();

    public String getTituloConteudo() {
        return tituloConteudo;
    }

    public void setTituloConteudo(String tituloConteudo) {
        this.tituloConteudo = tituloConteudo;
    }

    public String getDescricaoConteudo() {
        return descricaoConteudo;
    }

    public void setDescricaoConteudo(String descricaoConteudo) {
        this.descricaoConteudo = descricaoConteudo;
    }
}
