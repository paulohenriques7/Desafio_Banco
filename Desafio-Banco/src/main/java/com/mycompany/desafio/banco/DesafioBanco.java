
package com.mycompany.desafio.banco;

import java.util.ArrayList;
import java.util.List;

public class DesafioBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Paulo");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);

        Banco banco = new Banco("Banco Digital", contas);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}

