package ex2;

public class EmployeeDemo {
    public static void main(String[] args) {
        person[] arr = new person[3];
        Impiegato i1 = new Impiegato("张三","1106");
        Stagista s1 = new Stagista("实习生张三","1212");
        Stagista s2 = new Stagista("实习生李四","1213");
//        for(int i=0;1<arr.length;i++){
//            person p =new
//            System.out.println(arr[i]);
//        }

        arr[0]=i1;
        arr[1]=s1;
        arr[2]=s2;

        String min = cercaGiovane(arr);
        System.out.println(min);
        System.out.println(arr[0].getNome());
        System.out.println(s1.getNome()+" "+s1.getDate()+" "+s1.getSalary()+" "+s1.getNumeroIdentificativoStage()+" "+s1.getNumeroPresenze());
        System.out.println(s2.getNumeroPresenze());
    }
    public static String cercaGiovane(person[] arr){
        String min = arr[0].getDate();
        for(int i =1;i< arr.length;i++){
            if(min.compareTo(arr[i].getDate())>0){
                min = arr[i].getNome();
            }
        }
        return min;
    }
}