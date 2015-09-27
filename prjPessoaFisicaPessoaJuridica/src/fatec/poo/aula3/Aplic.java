package fatec.poo.aula3;

public class Aplic {

    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica("123.456.789-0", "João", 2013);
        PessoaJuridica pj = new PessoaJuridica("João Juridico", 2013, "28.223.115/0001-64");
        
        pf.setBase(1000);
        pf.addCompras(12000);
        
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Ano de Inscrição: " + pf.getAnoInscricao());
        System.out.println("Bônus Pessoa Física: " + pf.calcBonus(2015));
        
        pj.setTaxaIncentivo(100);
        pj.addCompras(2000);
        
        System.out.println("\n\nNome: " + pj.getNome());
        System.out.println("CGC: " + pj.getCgc());
        System.out.println("Ano de Inscrição: " + pj.getAnoInscricao());
        System.out.println("Bônus Pessoa Jurídica: " + pj.calcBonus(2015));
        
    }
}
