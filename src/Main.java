import java.io.*;
import java.net.SocketOption;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please, login");
        try {
            chooseUsers();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String chooseUsers() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your speciality");
        System.out.println("(1) Director");
        System.out.println("(2) Marketer");
        System.out.println("(3) HR");
        System.out.println("(4) Manager");
        System.out.println("(5) Worker");
        System.out.println("(6) SalesManager");
        System.out.println("(0) close");

        do {
            System.out.print("Your choice ");
            String choose = sc.nextLine();
            switch (choose.toLowerCase(Locale.ROOT)) {
                case "Director":
                case "1":
                    System.out.println("Welcome, Director");
                    System.out.println("Enter your username and password");
                    directorInputLgPw();
                    break;
                case "Marketer":
                case "2":
                    System.out.println("Welcome, Marketer");
                    System.out.println("Enter your username and password");
                    marketerInputLgPw();
                    break;
                case "HR":
                case "3":
                    System.out.println("Welcome, HR");
                    System.out.println("Enter your username and password");
                    HRInputLGgPw();
                    break;
                case "Manager":
                case "4":
                    System.out.println("Welcome, provider");
                    System.out.println("Enter your username and password");
                    managerInputLgPw();
                    break;
                case "Worker":
                case "5":
                    System.out.println("Welcome, provider");
                    System.out.println("Enter your username and password");
                    workerInputLgPw();
                    break;
                case "SalesManager":
                case "6":
                    System.out.println("Welcome, provider");
                    System.out.println("Enter your username and password");
                    salesmanagerInputLgPw();
                    break;
                default:
                    System.out.println("Who are you?");
                    System.out.print("Do you want to log out[1] or repeat[0]? ");
                    int ex = sc.nextInt();
                    if (ex == 0){
                        chooseUsers();
                    }
                    else if(ex == 1){
                        System.exit(0);
                    }
            }
            break;
        } while (true);
        return "";
    }

    public static void directorInputLgPw() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("director");
        loginArrayList.add("marketer");
        loginArrayList.add("HR");
        loginArrayList.add("manager");
        loginArrayList.add("worker");
        loginArrayList.add("salesmanager");
        passwordArrayList.add("dirPass");
        passwordArrayList.add("marPass");
        passwordArrayList.add("hrPass");
        passwordArrayList.add("manPass");
        passwordArrayList.add("worPass");
        passwordArrayList.add("salPass");

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Director, you loged in successfully!");
                directorsActions();
                break;
            } else {
                System.out.println("Repeat again");
            }
        } while (true);
    }

    public static void marketerInputLgPw() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Marketer, you loged in successfully!");
                marketersActions();
                break;
            } else {
                System.out.println("Repeat again");
            }
        } while (true);
    }

    public static void salesmanagerInputLgPw() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("SalesManager, you loged in successfully!");
                salesManagersActions();
                break;
            } else {
                System.out.println("Repeat again");
            }
        } while (true);
    }

    public static void HRInputLGgPw() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("HR, you loged in successfully!");
                Menu();
                break;
            } else {
                System.out.println("Repeat again!");
            }
        } while (true);
    }

    // Авторизация курьера

    public static void managerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Manager, you have logged in successfully!");
                managersActions();
                break;
            } else {
                System.out.println("Repeat again!");
            }
        } while (true);
    }
    public static void workerInputLgPw() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();

        do {
            System.out.print("Enter your username: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Enter your password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Provider, you have logged in successfully!");
                workersActions();
                break;
            } else {
                System.out.println("Repeat again!");
            }
        } while (true);
    }

    //Actions

    public static void directorsActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, director! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of all customer coverage areas by region");
        System.out.println("2. Show list of budget categories");
        System.out.println("3. Show allocated budget for a specific category of marketing slots");
        System.out.println("4. Show Current Marketing Tools");
        System.out.println("5. Show the total budget required for salary");
        System.out.println("6. Raise an employee's salary");
        System.out.println("7. Reduce an employee's salary");
        System.out.println("8. Show a list of equipment for the construction of facilities");
        do {
        System.out.print("Your choice: ");
        String chooseAction = sc.nextLine();

        switch (chooseAction.toLowerCase(Locale.ROOT)) {
            case "action1":
            case "1":
                System.out.println("Action 1");
                directorsAction1();
                directorsActions();
                break;
            case "action2":
            case "2":
                System.out.println("Action 2");
                directorsAction2();
                directorsActions();
                break;
            case "action3":
            case "3":
                System.out.println("Action 3");
                directorsAction3();
                directorsActions();
                break;
            case "action4":
            case "4":
                System.out.println("Action 4");
                directorsAction4();
                directorsActions();
                break;
            case "action5":
            case "5":
                System.out.println("Action 5");
                directorsAction5();
                directorsActions();
                break;
            case "6":
                System.out.println("Action 6");
                directorsAction6();
                directorsActions();
                break;
            case "7":
                System.out.println("Action 7");
                directorsAction7();
                directorsActions();
                break;
            case "8":
                System.out.println("Action 8");
                directorsAction8();
                directorsActions();
                break;
            default:
                System.out.println("There is no action like that in the list!");
                directorsActions();
                break;
            case "n":
                try {
                    chooseUsers();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "action0":
            case "Action0":
            case "0":
                System.out.println("Exit");
                chooseUsers();
                break;
        }break;
    } while (true);

    }

    // directors actions

    public static void directorsAction1(){
        
    }
    public static void salesManagersActions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, salesmanager! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("Menu:");
        System.out.println("1. Show list of all clients");
        System.out.println("2. Customer search:");
        System.out.println("3. Show available apartments for shopping");
        System.out.println("4. Show sold apartments");
        System.out.println("5. Show the most expensive apartment");
        System.out.println("6. Show the cheapest apartment");
        System.out.println("7. Exit");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction.toLowerCase(Locale.ROOT)) {
                case "action1":
                case "1":
                    System.out.println("Action 1");
                    action1();
                    salesManagersActions();
                    break;
                case "action2":
                case "2":
                    System.out.println("Action 2");
                    action2();
                    salesManagersActions();
                    break;
                case "action3":
                case "3":
                    System.out.println("Action 3");
                    action3();
                    salesManagersActions();
                    break;
                case "action4":
                case "4":
                    System.out.println("Action 4");
                    action4();
                    salesManagersActions();
                    break;
                case "action5":
                case "5":
                    System.out.println("Action 5");
                    action5();
                    salesManagersActions();
                    break;
                default:
                    System.out.println("There is no action like that in the list!");
                    salesManagersActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Exit");
                    break;
            }
            break;
        } while (true);
    }

    public static void action1() {
        System.out.println("");
    }

    public static void action2() {


    }

    public static void action3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }

            System.out.println(d);
            String s = "dsd";
            int m = 0;
            for (String i : d.keySet()) {
                if (d.get(i) > m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println("Maximum amount of fabrics is" + s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action4() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }
            System.out.println(d);
            String s = "dsd";
            int m = 100;
            for (String i : d.keySet()) {
                if (d.get(i) < m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println("Minimum amount of fabrics is:"+ s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action5() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            System.out.print("Delivered fabrics");
            int countLine = 0;
            while (br.ready()) {
                System.out.print(br.readLine() + ", ");
                countLine++;
            }
            System.out.println("Amount in rolls = " + countLine);
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt"));
            System.out.print("Delivered fabrics");
            int countline = 0;
            while (br1.ready()) {
                System.out.print(br1.readLine() + ", ");
                countline++;
            }
            System.out.println("Amount in rolls = " + countline);
            br1.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void managersActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, manager! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show list of employees");
        System.out.println("3. Show list of works");
        System.out.println("3. Show a list of instructions to employees");
        System.out.println("4. Show a list of all coverage areas");
        System.out.println("5. Exit");
    }

    public static void marketersActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, marketer! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of all customer coverage areas by region");
        System.out.println("2. Show list of categories for marketing");
        System.out.println("3. Show allocated budget for a specific category of marketing slots");
        System.out.println("4. Show total budget for marketing");
        System.out.println("5. Spend a budget on promotion:");
        System.out.println("6. Exit");
    }

    public static void HRActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, HR! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of all customer coverage areas by region");
        System.out.println("2. Show list of categories for marketing");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. Exit");
    }

    public static void workersActions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, worker! Choose the number of your work bellow. If you finished your work write 0.");

        System.out.println("1. Show a list of tasks assigned to me.");
        System.out.println("2. Show a list of completed directions.");
        System.out.println("3. Show the list of tasks I'm working on.");
        System.out.println("4. Show salary");
        System.out.println("5. Exit");
    }

    public static void Menu() throws IOException{
        System.out.println("1. Show all the kind of fabrics in the market");
        System.out.println("2. Search for fabric");
        System.out.println("3. Show the report about fabrics");
        System.out.println("4. Order a fabric");
        System.out.println("5. Look at the list of fabrics");
        System.out.println("6. Show the fabrics that we lack");
        System.out.println("7. Delete from order");
        System.out.println("8. Exit");
        ShowMenu();
    }
    public static void ShowMenu() throws IOException{
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("(Чтобы увидеть меню снова, нажмите [0]) Введите-->");
            var action = input.nextLine();
            switch(action){
                case "0": Menu(); break;
                case "1":
                    System.out.println("ShowFullList()");
                    break;
                case "2":
                    System.out.println("Search();");
                    break;
                case "3":
                    System.out.println("ShowReport();");
                    break;
                case "4":
                    System.out.println("Order();");
                    break;
                case "5":
                    System.out.println("OrderList();");
                    break;
                case "6":
                    System.out.println("Lack();");
                    break;
                case "7":
                    System.out.println("Delete();");
                    break;
                case "8": System.out.println("Exit()"); System.exit(1);
                break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                default: System.out.print("Пожалуйста, введите номера из меню.");
            }
        }
    }
    public static void deliverymanActions() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("(1)List of fabrics for devivery.");
        System.out.println("(2)Delivered fabrics.");
        System.out.println("(3)Deliver the fabric.");
        System.out.println("(4)Amount of fabrics for delivery.");
        System.out.println("(5)Amount of ordered fabrics.");
        System.out.println("(6)My balance.");
        System.out.println("(0)Exit");
        do {
            System.out.print("Your choice: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "n":
                    try{
                        Main.chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action1":
                case "Action1":
                case "1":
                    //СПИСОК ЗАКАЗАННОЙ ТЕХНИКИ.
                    /*
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt"))) {
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    deliverymanActions();*/
                    break;

                case "action2":
                case "Action2":
                case "2":
                    //СПИСОК ДОСТАВЛЕННОЙ ТЕХНИКИ.
                    /*try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"))) {
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    deliverymanActions();*/
                    break;

                case "action3":
                case "Action3":
                case "3":
                    System.out.println("Action 3");
                    //--ДОСТАВИТЬ ЗАКАЗ--
                    /*ArrayList<String> appliances = new ArrayList<String>(); // Для доставки
                    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt"))) {
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            appliances.add(line);
                        }
                        System.out.println(appliances);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt", true))) {
                        String i = "";
                        bw.write(i);
                        if (i.equals(i)) {
                            bw.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt", true))) {
                        int i = 0;
                        while (i <= appliances.size()) {
                            if (i == appliances.size()) {
                                bw.close();
                                System.out.println("Доставлено!");
                                break;
                            } else {
                                bw.newLine();
                                bw.write(appliances.get(i));
                                i++;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    deliverymanActions();*/
                    break;

                case "action4":
                case "Action4":
                case "4":
                    //--КОЛ-ВО ДОСТАВЛЕННОЙ БЫТ.ТЕХНИКИ--
                    /*try {

                        File myFile = new File("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt");
                        FileReader fileReader = new FileReader(myFile);
                        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                        int lineNumber = 0;

                        while (lineNumberReader.readLine() != null) {
                            lineNumber++;
                        }

                        System.out.println(lineNumber);

                        lineNumberReader.close();

                        String lineNumber1 = String.valueOf(lineNumber);
                        File newFile = new File("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\kol.txt");
                        FileWriter fileWriter = new FileWriter(newFile);
                        fileWriter.write(lineNumber1 + " Строк в файле: " + "C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt");
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    deliverymanActions();*/
                    break;


                case "action5":
                case "Action5":
                case "5":
                    //--КОЛ-ВО ЗАКАЗАННОЙ БЫТ.ТЕХНИКИ--
                    /*try {

                        File myFile = new File("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt");
                        FileReader fileReader = new FileReader(myFile);
                        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                        int lineNumber = 0;

                        while (lineNumberReader.readLine() != null) {
                            lineNumber++;
                        }

                        System.out.println(lineNumber);

                        lineNumberReader.close();

                        String lineNumber1 = String.valueOf(lineNumber);
                        File newFile = new File("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\kol.txt");
                        FileWriter fileWriter = new FileWriter(newFile);
                        fileWriter.write(lineNumber1 + " Строк в файле: " + "C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt");
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    deliverymanActions();*/
                    break;

                case "action6":
                case "Action6":
                case "6":
                    /*int count = 0;

                    try {
                        // create a new file object
                        File file = new File("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt");

                        // create an object of Scanner
                        // associated with the file
                        Scanner mn = new Scanner(file);

                        // read each line and
                        // count number of lines
                        while (mn.hasNextLine()) {
                            mn.nextLine();
                            count++;
                        }
                        System.out.println("Total Number of Delivered techniques: " + count);
                        System.out.println("Your Earnings: " + count * 2000);
                        // close scanner
                        mn.close();
                    } catch (java.lang.Exception e) {
                        e.getStackTrace();
                    }

                    deliverymanActions();*/
                    break;

                default:
                    System.out.println("Такого действия нет в программе!");
                    deliverymanActions();
                    break;

                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Exit");
                    break;

            }
            break;
        } while (true);
    }
}