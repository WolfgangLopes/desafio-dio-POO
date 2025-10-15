import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JS");
        curso1.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devCamila = new Dev();
        devCamila.setNome("Dev Camila");
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos concluídos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXP());


        Dev devJoao = new Dev();
        devJoao.setNome("Dev Joao");
        devJoao.inscreverBootamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXP());
    }
}