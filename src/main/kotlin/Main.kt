fun main() {
    ex1(2);
}

// ex1) Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
fun ex1(anos: Int, ){
    println("$anos anos equivalem a: ");
    println("${anos * 12} meses");
    println("${anos * 365} dias");
    println("${anos * 365 * 24} horas");
    println("${anos * 365 * 24 * 60} minutos");
    println("${anos * 365 * 24 * 60 * 60} segundos");
}

