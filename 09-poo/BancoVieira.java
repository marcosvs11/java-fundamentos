import java.util.Scanner;

public class BancoVieira {
    Scanner teclado = new Scanner(System.in);

    public int numConta;
    private static int proximoNumero = 1;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public BancoVieira() {
        setStatus(false);
        setSaldo(0.00);
        setTipo("");
    }

    public int getNumConta() {
        return numConta;
    }

    private void setNumConta() {
        this.numConta = proximoNumero;
        proximoNumero++;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void abrirConta() {
        boolean flag;
        if (isStatus() == false) {
            setStatus(true);
            setNumConta();
            do {
                flag = false;
                System.out.print("Digite o seu nome completo: ");
                var verificarDono = teclado.nextLine();
                if (verificarDono.isBlank()) {
                    System.out.println("Erro! Nome não digitado, tente novamente!");
                    flag = true;
                } else {
                    setDono(verificarDono);
                }
            } while (flag);
            do {
                flag = false;
                System.out.println("# Banco Vieira #");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                System.out.print("Digite o tipo de conta: ");
                var tipoTeste = teclado.nextInt();
                if (tipoTeste == 1) {
                    setTipo("Conta Corrente");
                    setSaldo(50);
                } else if (tipoTeste == 2) {
                    setTipo("Conta Poupança");
                    setSaldo(150);
                } else {
                    System.out.println("Entrada inválida, tente novamente!");
                    flag = true;
                }
            } while (flag);
            System.out.println("Seja bem-vindo(a), " + getDono() + "!");
            System.out.println(getTipo() + " criada com sucesso!");
            System.out.println("Numéro da conta: " + (getNumConta()));
            System.out.println("Saldo inicial: R$" + getSaldo());
        } else {
            System.out.println("Erro! Usuário já possui uma conta criada!");
        }
    }

    public void fecharConta() {
        boolean flag;
        if (isStatus() == true && getSaldo() == 0) {
            do {
                flag = false;
                System.out.println("        -----ATENÇÃO-----");
                System.out.println("Processo de fechamento da conta iniciado...");
                System.out.print("Digite 'S' para FECHAR sua conta [S/N]: ");
                char confirmarFechar = teclado.next().toUpperCase().charAt(0);
                if (confirmarFechar == 'S') {
                    setStatus(false);
                    System.out.println(getTipo() + " FECHADA com sucesso!");
                    System.out.println("O Banco Vieira sentirá sua falta...");
                } else if (confirmarFechar == 'N') {
                    System.out.println("Que bom que escolher ficar conosco!");
                } else {
                    System.out.println("Entrada inválida, tente novamente!");
                    flag = true;
                }
            } while (flag);
        } else {
            System.out.println("Erro! Verifique se a conta está criada, se possui saldo disponível para saque ou saldo devedor.");
        }
    }

    public void depositar() {
        if  (isStatus() == true) {
            System.out.print("Digite o valor para o depósito: ");
            var valorDep = teclado.nextDouble();
            if (valorDep > 0) {
                setSaldo(valorDep);
                System.out.println("Valor depositado com sucesso!");
                System.out.println("Saldo atual: " + getSaldo());
            } else {
                System.out.println("Erro! Não é permitido realizar esta operação");
            }
        }
    }

    public void sacar() {
        if (isStatus() == true) {
            System.out.print("Digite o valor para o saque: ");
            var valorSac = teclado.nextDouble();
            if (getSaldo() >= valorSac && valorSac > 0) {
                setSaldo(-valorSac);
                System.out.println("Valor sacado com sucesso!");
                System.out.println("Saldo atual: " + getSaldo());
            } else {
                System.out.println("Erro! Não é permitido realizar esta operação");
            }
        }
    }

    public void pagarMensal() {
        double valorMensal;
        System.out.println("Realizando pagamento da mensalidade ao Banco Vieira...");
        if (getTipo().equals("Conta Corrente")) {
            valorMensal = 12;
            setSaldo(-valorMensal);
            System.out.println("Pagamento concluido com sucesso!");
            System.out.println("Valor mensal Conta Corrente de R$" + valorMensal + " destinado à manutenção da conta!");
            System.out.println("Saldo atual: " + getSaldo());
        } else if (getTipo().equals("Conta Poupança")) {
            valorMensal = 20;
            setSaldo(-valorMensal);
            System.out.println("Pagamento concluido com sucesso!");
            System.out.println("Valor mensal Conta Poupança de R$" + valorMensal + " destinado à manutenção da conta!");
            System.out.println("Saldo atual: " + getSaldo());
        } else {
            System.out.println("Erro! Não foi encontrado a conta do usuário, tente novamente!");
        }
    }
}
