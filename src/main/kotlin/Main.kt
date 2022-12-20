fun main() {
    println(ex4(3f));
}

// ex1) Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
fun ex1(anos: Int) {
    println("$anos anos equivalem a: ");
    println("${anos * 12} meses");
    println("${anos * 365} dias");
    println("${anos * 365 * 24} horas");
    println("${anos * 365 * 24 * 60} minutos");
    println("${anos * 365 * 24 * 60 * 60} segundos");
}

//ex2) Escreva uma função capaz de recebeer uma string e retornar a quantidade de caracteres.
fun ex2(str: String): Int {
    return str.length;
}

//ex3) Escreva uma função capaz de calcular o cubo de um número inteiro.
fun ex3(n: Int): Int {
    return n * n * n;
}

//ex4) Escreva uma função capaz de receber milhas e converter em km.
fun ex4(milhas: Float): Float {
    return milhas * 1.6f;
}
