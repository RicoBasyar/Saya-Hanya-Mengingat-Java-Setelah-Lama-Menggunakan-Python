public class Main{
    public static void main(String[] args){
        /* Multi-line comment */
        String name = "test 123";
        int myNumber = 2147483647; // <-- max
        long myLongNumber = 9223372036854775807L;
        float myDecimal = 3.14f; // float itu 32 bit 
        double myDecimal_double = 3.1412d; // double itu 64 bit
        char myChar = 'R';
        boolean myBoolean = true;

        // ini output
        System.out.println("Hello World");
        System.out.println(3 + 3 * 3);
        System.out.println(name + myNumber);

        /* Casting (Convert Tipe data kelebih besar atau kecil)
           Widening Casting (automatically) byte -> short -> char -> int -> long -> float -> double
           Narrowing Casting (manually) double -> float -> long -> int -> char -> short -> byte */
        
        //Widening Casting Sesuai namanya melebarkan atau mengubah tipe data ke yang besar//i
        // Contoh Integer
        int myInt = 60;
        long myLong = myInt;

        System.out.println(myInt);
        System.out.println(myLong);

        // Contoh int ke decimal
        double myDouble = myInt;
        System.out.println(myDouble);

        //Narrowing kebalikannya dari besar ke kecil, Manual soalnya ga otomatis kaya yang kecil ke besar.
        double myDouble_1 = 20.698;
        int myInt_1 = (int) myDouble_1;
        
        System.out.println(myInt_1);

        int x = 5;
        int i = 6;
        System.out.println(x<=5 && i<=5); // Logic And
        System.out.println(x<=5 || i<=5); // Logic Or
        System.out.println(!(x<=5 && i<=5)); // Logic Not

        //=======================================================================================//
        //===================================Java String=========================================//
        
        String greeting = "Hello";
        System.out.println(greeting+ " " + greeting.length()); // Total huruf
        System.out.println(greeting.toLowerCase()); //lower case
        System.out.println(greeting.toUpperCase()); //upper case

        String txt = "bagaimana cara memakan buah apel tanpa memakannya?";
        System.out.println(txt.indexOf("memakan")); // Cari index string

        System.out.println(greeting + " " + txt); // Contoh Concatenate
        System.out.println(greeting.concat(txt)); // Masih sama tapi pake method concat()

        
        String x_string = "20";
        int x_int = 10;

        System.out.println(x_string + x_int); // Kalo gabungin String sama int jadinya string gaes
        
        String specialCharacter = "it\'s Muhammad Ilham Kusumawardhana atau biasa dipanggil \"Kawe\""; // pake backslash buat masukin special character ke string.
        System.out.println(specialCharacter);

        //=============================================================================================================//
        //===========================================Java Math=========================================================//
        System.out.println(Math.max(10, 20));

        int angkaMax = Math.max(5,10); // bisa pake max, min parameter (x,y)
        System.out.println(angkaMax);

        int akarPangkat = (int) Math.sqrt(25); // Akar pangkat, Aslinya pake double cuma gw convert ke int.git a
        System.out.println(akarPangkat);

        double randomNumber =  Math.random() * 101; // Angka Random dari 0 - 100
        System.out.println(Math.round(randomNumber)); // Angka Random tadi ditampilin terus dibulatkan biar ga decimal

        //=============================================================================================================//
        //=============================================Java Boolean====================================================//
    
        boolean isJavaFun = true;
        boolean isFishFun = false;

        System.out.println(isJavaFun);
        System.out.println(isFishFun);

        //=============================================================================================================//
        //=============================================Java If else====================================================//

        int xIf = 14;

        if(xIf > 15){
            System.out.println("Anjay lebih dari 15");
        }else if(xIf == 15){
            System.out.println("Sama sama 15");
        }
        else {
            System.out.println("Kurang dari 15 anjay");
        }
        // Dibawah ini contoh cepatnya pake if atau bisa dibilang short hand if else
        String resultX = (xIf <= 15) ? "Kurang dari 15" : "lebih dari 15";
        System.out.println(resultX); 

        int age = 12;
        String passGate = (age > 18) ? "Okey bruh you pass" : "You shall not pass";
        System.out.println(passGate);

        //==================================================================================================//
        //========================================Java Switch===============================================//
        int switchIO = 0;
        boolean IO;
        switch(switchIO){
            case 0:
            System.out.println("Lampu mati");
            break;
            case 1:
            System.out.println("Lampu nyala");
            break;
            default:
            System.out.println("Bruhh switch on off cuma ada 1 sama 0");
        }
        
        //===================================================================================================//
        //=========================================Java Loops================================================//

        int iLoop = 0;
        while(iLoop < 16){
            System.out.println(iLoop);
            iLoop++;
        }
        System.out.println(iLoop + "<< ini Variabel iLoop setelah while");
        do{
            System.out.println("*");
            iLoop++;
        }while(iLoop < 30);
        System.out.println(iLoop);
        System.out.println(iLoop + "<< ini Variabel iLoop setelah do while");
    }
}