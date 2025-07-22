
// interface Mits{
//     void repetation(int n);
// }

// class Teacher implements Mits{
//     public void repetation(int n)
//     {
//         for(int i = 0; i <n; i++)
//             System.out.println("auspicious");

        
//     }
// }
// public class lamda {
//     public static void main(String[] args)
//     {
//         Mits obj=new Teacher();
//         obj.repetation(5);
//         System.out.println("bye");
        
// }
// }

interface Mits{
    void repetation(int n);
}

public class lamda {
    public static void main(String[] args)
    {
        Mits obj=(n)->{
            for(int i = 0; i <n; i++)
             System.out.println("auspicious");
        };
        obj.repetation(5);
        System.out.println("bye");
        
}
}
