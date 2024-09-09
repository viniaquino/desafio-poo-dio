import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso javascript");
            curso2.setDescricao("descrição curso javascript");
            curso2.setCargaHoraria(8);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());

            /*System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devVinicius = new Dev();
            devVinicius.setNome("Vinícius");
            devVinicius.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos Inscritos Vinícius: " + devVinicius.getConteudosInscritos());

            devVinicius.progredir();
            devVinicius.progredir();

            System.out.println("Conteudos Inscritos Vinícius: " + devVinicius.getConteudosInscritos());
            System.out.println("Conteudos Concluídos Vinícius: " + devVinicius.getConteudosConcluidos());
            System.out.println("XP: " + devVinicius.calcularTotalXp());

            System.out.println("---------------");

            Dev devJoao = new Dev();
            devJoao.setNome("João");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());

            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();

            System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
            System.out.println("Conteudos Concluídos João: " + devJoao.getConteudosConcluidos());
            System.out.println("XP: " + devJoao.calcularTotalXp());


        }
}
