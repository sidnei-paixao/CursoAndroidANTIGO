class Conta(nNumero: Int, oCliente: Cliente)
{
    var nSaldo: Double = 0.0;

    constructor(nNumero: Int, oCliente: Cliente, nSaldo: Double) : this (nNumero, oCliente)
    {
        this.nSaldo = nSaldo;
    }

    fun fnDeposito(nValor: Double)
    {
        this.nSaldo+= nValor;
        println("Depósito realizado! Saldo atual: ${this.nSaldo}");
    }
    fun fnSaque(nValor: Double)
    {
        if (this.nSaldo < nValor)
            println("Saldo insuficiente - operação não realizada!");
        else
        {
            this.nSaldo -= nValor;
            println("Saque realizado! Saldo atual: ${this.nSaldo}");
        }
    }
}