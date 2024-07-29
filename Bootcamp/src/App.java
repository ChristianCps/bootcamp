import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTituloConteudo("Curso Java");
        cursoJava.setDescricaoConteudo("Descrição do curso de Java");
        cursoJava.setDuracaoHoras(8);

        Curso cursoJS = new Curso();
        cursoJS.setTituloConteudo("Curso JavaScript");
        cursoJS.setDescricaoConteudo("Descrição do curso de JavaScript");
        cursoJS.setDuracaoHoras(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTituloConteudo("Mentoria de Java");
        mentoriaJava.setDescricaoConteudo("Descrição da mentoria de Java");
        mentoriaJava.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNomeBootcamp("Bootcamp Java Developer");
        bootcamp.setDescricaoBootcamp("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudoBootcamp().add(cursoJava);
        bootcamp.getConteudoBootcamp().add(cursoJS);
        bootcamp.getConteudoBootcamp().add(mentoriaJava);

        Dev devChristian = new Dev();
        devChristian.setNomeDev("Christian");
        devChristian.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Christian:" + devChristian.getConteudosInscritosDev());
        devChristian.avancar();
        devChristian.avancar();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Christian:" + devChristian.getConteudosInscritosDev());
        System.out.println("Conteúdos Concluídos Christian:" + devChristian.getConteudosConcluidosDev());
        System.out.println("XP:" + devChristian.calcularTotalXpDev());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNomeDev("Joao");
        devJoao.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritosDev());
        devJoao.avancar();
        devJoao.avancar();
        devJoao.avancar();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritosDev());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidosDev());
        System.out.println("XP:" + devJoao.calcularTotalXpDev());
    }
}

