package fatec.poo.aula4;

import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");

        FuncionarioHorista funchor = new FuncionarioHorista(1010, "Pedro Silveira", "12/11/1999", 15.5);
        funchor.setCargo("Programador");
        funchor.setQtdeHorTrab(90);
        
        System.out.println("Registro: " + funchor.getRegistro());
        System.out.println("Nome: " + funchor.getNome());
        System.out.println("Cargo: " + funchor.getCargo());
        System.out.println("Data de Admissão: " + funchor.getDataAdmissao());
        System.out.println("Salario Bruto: " + df.format(funchor.calcSalBruto()));
        System.out.println("Valor do Desconto: " + df.format(funchor.calcDesconto()));
        System.out.println("Valor da Gratificação: " + df.format(funchor.calcGratificacao()));
        System.out.println("Salario Liquido: " + df.format(funchor.calcSalLiquido()));
        
        FuncionarioMensalista funcmen = new FuncionarioMensalista(1010, "Pedro Silveira", "12/11/1999", 15.5);
        
        funcmen.setNumSalMinimo(90);
        funcmen.setCargo("Programador");
         
        System.out.println("Registro: " + funcmen.getRegistro());
        System.out.println("Nome: " + funcmen.getNome());
        System.out.println("Cargo: " + funchor.getCargo());
        System.out.println("Data de Admissão: " + funcmen.getDataAdmissao());
        System.out.println("Salario Bruto: " + df.format(funcmen.calcSalBruto()));
        System.out.println("Salario Liquido: " + df.format(funcmen.calcSalLiquido()));
        System.out.println("Valor do Desconto: " + df.format(funcmen.calcDesconto()));
        
        
        FuncionarioComissionado funccon = new FuncionarioComissionado(1010, "Felipe Silveira", "12/11/1999", 0.02);
        
        funccon.setSalBase(100);
        funccon.setCargo("Programador");
        
        funccon.addVendas(9500);
        funccon.addVendas(200);
        funccon.addVendas(1400);
        
        System.out.println("Registro: " + funccon.getRegistro());
        System.out.println("Nome: " + funccon.getNome());
        System.out.println("Cargo: " + funccon.getCargo());
        System.out.println("Data de Admissão: " + funccon.getDataAdmissao());
        System.out.println("Salario Bruto: " + df.format(funccon.calcSalBruto()));
        System.out.println("Salario Liquido: " + df.format(funccon.calcSalLiquido()));
        System.out.println("Valor do Desconto: " + df.format(funccon.calcDesconto()));
    }
    
}
