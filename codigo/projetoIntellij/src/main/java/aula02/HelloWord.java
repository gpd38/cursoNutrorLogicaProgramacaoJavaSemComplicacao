package aula02;

public class HelloWord {
    public static void main(String[] args) {
        boolean encontrado = false;
        System.out.println("encontrado :" + encontrado);
        encontrado = true;
        System.out.println("encontrado :" + encontrado);

        char varChar = 'A';
        float varFloat = 12.5f;
        double varDouble = 12.5;
        System.out.println("varChar: " + varChar);
        System.out.println("varFloat :" + varFloat);
        System.out.println("varDouble :" + varDouble);

        byte varByte = 127;
        short varShort = 32767;
        int varInt = 0;
        long varlong = 9223372036854775806L;
        System.out.println("varByte :" + varByte);
        System.out.println("varShort :" + varShort);
        System.out.println("varInt :" + varInt);
        System.out.println("varlong :" + varlong);

        String nome = "Leila";
        Integer idade = 47;
        System.out.println("nome :" + nome);
        System.out.println("idade :" + idade);
    }
}
