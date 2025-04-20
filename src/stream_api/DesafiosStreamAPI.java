package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DesafiosStreamAPI {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);
        //Desafio 1
        //numeros.stream().sorted().forEach(System.out::println);
        //Desafio 2
        //System.out.println(numeros.stream().filter(n-> n % 2 == 0).reduce(0, Integer::sum));
        //Desafio 3
        //System.out.println(numeros.stream().allMatch(n -> n > 0));
        //Desafio 4
        //numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        //Desafio 5
        /*long media = (numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum) / numeros.stream().filter(n -> n > 5).count());
        System.out.println(media);*/
        //Desafio 6
        //System.out.println(numeros.stream().anyMatch(n -> n > 10));
        //Desafio 7
        //System.out.println(numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
        //Desafio 8
        //System.out.println(numeros.stream().reduce(0, Integer::sum));
        //Desafio 9
        //System.out.println(numeros.stream().distinct().count() == numeros.size());
        //Desafio 10
        //numeros.stream().filter(n1 -> (n1 % 3 == 0 || n1 % 5 == 0)).sorted().forEach(System.out::println);
        //Desafio 11
        //System.out.println(numeros.stream().reduce(0, (a,b) -> a + b*b));
        //Desafio 12
        //System.out.println(numeros.stream().reduce(1, (a,b) -> a*b));
        //Desafio 13
        //numeros.stream().filter(n1 -> n1 >= 5 && n1 <= 10).forEach(System.out::println);
        //Desafio 14
        //System.out.println(numeros.stream().distinct().sorted(Comparator.reverseOrder()).filter(n1 -> n1 > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n1))
        //        .noneMatch(i -> n1 % i == 0)).findFirst());
        //Desafio 15
        //System.out.println(numeros.stream().anyMatch(n1 -> n1 < 0));
        //Desafio 16
        /*var numerosPares = numeros.stream().filter(n1 -> n1 % 2 == 0).toList();
        var numerosImpares = numeros.stream().filter(n1 -> n1 % 2 == 1).toList();
        System.out.println("Números pares: " + numerosPares.toString() + "\n" + "Números ímpares: " + numerosImpares.toString());
        */
        //Desafio 17
        //numeros.stream().distinct().filter(n1 -> n1 > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n1)).noneMatch(i -> n1 % i == 0)).forEach(System.out::println);
        //Desafio 18
        //System.out.println(numeros.stream().allMatch(n1 -> n1.equals(numeros.getFirst())));
        //Desafio 19
        //numeros.stream().filter(n1 -> (n1 % 3 == 0 && n1 % 5 == 0)).forEach(System.out::println);
    }
}
