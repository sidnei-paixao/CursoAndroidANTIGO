fun main()
{
    var oPesFisica = Cliente("Wandergleydhson", "Daçiuwa");
    var oPesJuridica = Cliente("Frigorífico", "Maçã Verde");
    var oCtaFisica = Conta(1001, oPesFisica)
    var oCtaJurid = Conta(1002, oPesJuridica, 1000000.0);

    //oCliente.nome="Segisfredo";
    //oCliente.sobrenome="Daçiuwa";

    //println("${oCliente.nome} ${oCliente.sobrenome}: ${oContaCorrente.nSaldo}");
    oCtaFisica.fnDeposito(100.0);
    oCtaFisica.fnSaque(30.0);
    oCtaFisica.fnSaque(80.0);
    oCtaJurid.fnDeposito(15000.0);
    oCtaJurid.fnSaque(5800.0);
    //println("${oCliente.nome} ${oCliente.sobrenome}: ${oContaCorrente.nSaldo}");
}