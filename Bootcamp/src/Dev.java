import java.util.*;

public class Dev {
    private String nomeDev;
    private Set<Conteudo> conteudosInscritosDev = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidosDev = new LinkedHashSet<>();

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritosDev.addAll(bootcamp.getConteudoBootcamp());
        bootcamp.getDesenvolvedoresInscritos().add(this);
    }

    public void avancar() {
        Optional<Conteudo> conteudo = this.conteudosInscritosDev.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidosDev.add(conteudo.get());
            this.conteudosInscritosDev.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXpDev() {
        return this.conteudosConcluidosDev.stream()
                .mapToDouble(Conteudo::calcularExperiencia)
                .sum();
    }

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public Set<Conteudo> getConteudosInscritosDev() {
        return conteudosInscritosDev;
    }

    public void setConteudosInscritosDev(Set<Conteudo> conteudosInscritosDev) {
        this.conteudosInscritosDev = conteudosInscritosDev;
    }

    public Set<Conteudo> getConteudosConcluidosDev() {
        return conteudosConcluidosDev;
    }

    public void setConteudosConcluidosDev(Set<Conteudo> conteudosConcluidosDev) {
        this.conteudosConcluidosDev = conteudosConcluidosDev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nomeDev, dev.nomeDev) && 
               Objects.equals(conteudosInscritosDev, dev.conteudosInscritosDev) && 
               Objects.equals(conteudosConcluidosDev, dev.conteudosConcluidosDev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDev, conteudosInscritosDev, conteudosConcluidosDev);
    }
}

