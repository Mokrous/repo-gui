/**
 * Java 1 HomeWork_5
 * @author Mokrous Aleksei
 * version 01.01.2022
 *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 * */
public class HomeWork_5 {
    public static void main(String[] args) {
        StaffMember[] staffMembers = {
                new StaffMember("Dudnick Isaac", "writer", "dudnick@gmail.com", "1111111", 30000, 35),
                new StaffMember("Smith John", "engineer", "Smith@gmail.com", "2222222", 41000, 38),
                new StaffMember("Vasilyev Vaso", "Head of department", "vaso@gmail.com", "3333333", 150000, 56),
                new StaffMember("Sidorov Isaac", "junior", "sidorov@gmail.com", "4444444", 27000, 42),
                new StaffMember("Andreev Isaac", "worker", "andreev@gmail.com", "5555555", 150000, 17)
        };

        for (StaffMember staffMember : staffMembers) {
            if (staffMember.getAge() > 40) {
                System.out.println(staffMember);
            }
        }
    }
}


    class StaffMember {
        private String name;
        private String position;
        private String email;
        private String telephone;
        private int salary;
        private int age;

        public StaffMember(String name, String position, String email, String telephone,
                           int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }



        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return (name +
                     "\n| Position:" + position +
                    "\n| Email:" + email +
                    "\n| Telephone:" + telephone +
                    "\n| Salary:" + salary +
                    "\n| Age:" + age);

        }
    }

