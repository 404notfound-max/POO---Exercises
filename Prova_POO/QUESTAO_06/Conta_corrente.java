package POO.Prova_POO.QUESTAO_06;

class Conta_corrente {
    protected double balance;

    Conta_corrente() {
        balance = 0;
    }

    Conta_corrente(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void depositar(double value) {
        if (value < 0) {
            System.out.println("Valor inválido");
            System.exit(1);
        }

        balance += value;
    }

    protected boolean withdraw(double value) {
        if(balance - value < 0) return false;
        balance -= value;
        return true;
    }

    boolean transfer(Conta_corrente account) {
        double transferValue = this.getBalance();
        this.withdraw(transferValue);
        account.depositar(transferValue);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%f\n", balance);
    }
}