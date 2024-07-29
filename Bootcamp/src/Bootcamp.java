import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nomeBootcamp;
    private String descricaoBootcamp;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Dev> desenvolvedoresInscritos = new HashSet<>();
    private Set<Conteudo> conteudoBootcamp = new LinkedHashSet<>();

    public String getNomeBootcamp() {
        return nomeBootcamp;
    }

    public void setNomeBootcamp(String nomeBootcamp) {
        this.nomeBootcamp = nomeBootcamp;
    }

    public String getDescricaoBootcamp() {
        return descricaoBootcamp;
    }

    public void setDescricaoBootcamp(String descricaoBootcamp) {
        this.descricaoBootcamp = descricaoBootcamp;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDesenvolvedoresInscritos() {
        return desenvolvedoresInscritos;
    }

    public void setDesenvolvedoresInscritos(Set<Dev> desenvolvedoresInscritos) {
        this.desenvolvedoresInscritos = desenvolvedoresInscritos;
    }

    public Set<Conteudo> getConteudoBootcamp() {
        return conteudoBootcamp;
    }

    public void setConteudoBootcamp(Set<Conteudo> conteudoBootcamp) {
        this.conteudoBootcamp = conteudoBootcamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nomeBootcamp, bootcamp.nomeBootcamp) && 
               Objects.equals(descricaoBootcamp, bootcamp.descricaoBootcamp) && 
               Objects.equals(dataInicio, bootcamp.dataInicio) && 
               Objects.equals(dataFim, bootcamp.dataFim) && 
               Objects.equals(desenvolvedoresInscritos, bootcamp.desenvolvedoresInscritos) && 
               Objects.equals(conteudoBootcamp, bootcamp.conteudoBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeBootcamp, descricaoBootcamp, dataInicio, dataFim, desenvolvedoresInscritos, conteudoBootcamp);
    }
}

