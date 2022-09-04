import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TratamentoAtividade {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionários serão registrados?");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.println("Funcionário " + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, name, salario);

            list.add(funcionario);

        }
            System.out.println();
            System.out.println("Insira o ID do funcionário que você quer dar o aumento: ");
            int id = sc.nextInt();

            int position =  findID(list, id);
            if(position == -1){
                System.out.println("Id não encontrado");
            }else{
                System.out.println("Insira a porcentagem que deseja aumentar: ");
                double aumento = sc.nextInt();
                list.get(position).aumentarSalario(aumento);

                System.out.println();
                System.out.println("Lista de funcionários: ");

                for(Funcionario funcionario : list){
                    System.out.println(funcionario);
                }

            }

            sc.close();

    }

    public static int findID(List<Funcionario> list , int id){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return  i;
            }
        }
        return -1;
    }

}
